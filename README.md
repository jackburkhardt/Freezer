# Freezer
 Simple Spigot plugin to completely freeze players. Prevents players from interacting with other players, entities, inventories, and also stops movement, damage, and physics.
 
 Built using 1.8.8 Spigot API, might work on latest version.
 
 NOTE: This plugin is designed primarily for minigames, tournaments, or other highly controlled modes, and has not been tested for more open-ended usage (such as a Survival world). As a result, you may find that some things are not properly frozen or cancelled when the command is run.
 
 Commands and permissions:
-  /freeze - toggles freeze. permission: freeze.permission (default op)
-  /freeze confirm - (coming later) verifies you want to freeze the game
-  freeze.exempt (default op) - exempts players with the permission from being affected by freeze mode
 
 Known issues:
 - If players shift click stuff fast enough in their inventories while frozen, it can ghost out and disappear. I'll likely be implementing a fix later.
