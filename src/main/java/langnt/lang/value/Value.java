package langnt.lang.value;

import langnt.util.Assert;
import langnt.util.KebabException;

import java.util.List;

public class Value implements Comparable<Value> {

    public enum Values {
        BOOLEAN_TRUE("yes"),
        BOOLEAN_FALSE("no"),
        EMPTY("empty"),
        VOID("void");

        String name;

        Values(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static final Value EMPTY = new Value();
    public static final Value VOID = new Value();

    private final Object value;

    private Value() {
        this.value = new Object();
    }

    public Value(Object value) {
        Assert.notNull(value);
        this.value = value;
        this.validate();
    }

    @Override
    public int compareTo(Value that) {
        if (this.isNumber() && that.isNumber()) {
            if (this.equals(that)) {
                return 0;
            } else {
                return this.asDouble().compareTo(that.asDouble());
            }
        } else if (this.isString() && that.isString()) {
            return this.asString().compareTo(that.asString());
        } else {
            throw new KebabException("Cannot compare: '%s' to: '%s'", this, that);
        }
    }

    /**
     * Return current value as boolean, empty value counts as false.
     *
     * @return current value as boolean.
     */
    public Boolean asBoolean() {
        if (isBoolean()) {
            return (Boolean) value;
        }
        return !isEmpty();
    }

    public Double asDouble() {
        return ((Number) value).doubleValue();
    }

    public Long asLong() {
        return ((Number) value).longValue();
    }

    @SuppressWarnings("unchecked")
    public List<Value> asList() {
        return (List<Value>) value;
    }

    public String asString() {
        return (String) value;
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isNumber() {
        return value instanceof Number;
    }

    public boolean isList() {
        return value instanceof List<?>;
    }

    public boolean isEmpty() {
        return this == EMPTY;
    }

    public boolean isVoid() {
        return this == VOID;
    }

    public boolean isString() {
        return value instanceof String;
    }

    /**
     * Throw an exception if invalid value is assigned.
     */
    private void validate() {
        if (!(isBoolean() || isList() || isNumber() || isString())) {
            throw new KebabException("Got invalid type: %s", value.getClass());
        }
    }

    /**
     * Get the pure value of this kebab value wrapper.
     *
     * @return pure value.
     */
    public Object get() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == VOID || other == VOID) {
            throw new KebabException("Cannot use VOID: %s ==/!= %s", this, other);
        }
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Value that = (Value) other;
        if (this.isNumber() && that.isNumber()) {
            double diff = Math.abs(this.asDouble() - that.asDouble());
            return diff < 0.00000000001;
        } else {
            return this.value.equals(that.value);
        }
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return Values.EMPTY.getName();
        } else if (isVoid()) {
            return Values.VOID.getName();
        } else if (isBoolean()) {
            return Boolean.valueOf(value.toString()) ? Values.BOOLEAN_TRUE.getName() : Values.BOOLEAN_FALSE.getName();
        } else if (isNumber()) {

            double doubleValue = asDouble();
            int intValue = ((int) doubleValue);

            // Our value might be a int.
            if (doubleValue == intValue) {
                return Integer.toString(intValue);
            }
            return Double.toString(doubleValue);

        } else {
            return String.valueOf(value);

        }
    }
}