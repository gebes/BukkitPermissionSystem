package eu.gebes.BukkitPermissionSystem.v1;

import java.util.LinkedList;
import java.util.List;

public interface Permissible {

    List<String> permissions = new LinkedList<>();

    /**
     * @return true when the permission did already exist
     */
    boolean addPermission(String permission);

    /**
     * @param permission to check
     * @return true when the Object has the permission
     */
    boolean hasPermission(String permission);

    /**
     * @return if the permission existed
     */
    boolean removePermission(String permission);

}
