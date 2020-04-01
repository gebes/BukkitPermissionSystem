package eu.gebes.BukkitPermissionSystem.v1;

import java.util.List;

public class BukkitPermissionSystem {


    /**
     * Test Main
     */
    public static void main(String[] args) {
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
    }

    public static boolean hasPermission(String permissionToCheck, List<String> permissions) {

        if (permissions.contains(permissionToCheck) || permissions.contains("*")) return true;

        final String[] nodes = permissionToCheck.split("\\.");

        String currentNodeProgress = "";
        for (int i = 0; i < nodes.length; i++) {
            if (i == 0)
                currentNodeProgress = nodes[i];
            else
                currentNodeProgress += "." + nodes[i];

            if (permissions.contains(currentNodeProgress) || permissions.contains(currentNodeProgress + ".*"))
                return true;

        }

        return false;
    }

}
