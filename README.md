# BukkitPermissionSystem
Old but gold. Use the well known Bukkit Permission System in your Java Project

## Getting Started

These short instructions will help you, to implement this code into your project.
And be aware of bugs🐞, i warned you (just kidding)

### Implementation
Download and copy the folder `eu.gebes.BukkitPermissionSystem` into your Project folder.  
You can also add it as a module, if you want.



## Example

Bukkit's permission system is built with nodes.
If one node in your permission list equals to a star, like '*', then you automatically are granted to all permissions of this and its subnodes.

Take a look at this example:

```java
        System.out.println(hasPermission("app.store.id123.performAction", List.of("*")));// true
        System.out.println(hasPermission("app.store.id123.performAction", List.of("app.*")));// true
        System.out.println(hasPermission("app.store.id123.performAction", List.of("app.store.*")));// true
        System.out.println(hasPermission("app.store.id123.performAction", List.of("app.store.id123.*")));// true
        System.out.println(hasPermission("app.store.id123.performAction", List.of("app.store.id123.performAction")));// true


        System.out.println(hasPermission("app.store.idSomethingElse.performAction", List.of("*")));// true
        System.out.println(hasPermission("app.store.idSomethingElse.performAction", List.of("app.*")));// true
        System.out.println(hasPermission("app.store.idSomethingElse.performAction", List.of("app.store.*"))); // true
        System.out.println(hasPermission("app.store.idSomethingElse.performAction", List.of("app.store.id123.*"))); // false
        System.out.println(hasPermission("app.store.idSomethingElse.performAction", List.of("app.store.id123.performAction"))); // false

```

## Contributing

Any helpful hand is appreciated, so don't be shy🙈.  

## License

No License.  
Do anything you want to do with this piece code

## What did I learn?
* Rewriting modules you have used years ago is fun!
