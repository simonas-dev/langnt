# langn't -- Not Really a Language

### Setup/Build
To build a project:
```bash
./gradlew build
```

To genrate runnable jar:
```bash
./gradlew jar
```

To list all posible tasks:
```bash
./gradlew task
```

### Usage

`test.nt`
```
fu hello(message: 'Hello World!') {
  println(message)
}

hello()
```

You can run it like this:
```bash
java -jar ./build/libs/langnt.jar test.nt
```

### Example Code
You can find a list of complete example files [here](src/main/resources).
