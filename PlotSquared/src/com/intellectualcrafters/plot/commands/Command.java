/*
 * Copyright (c) IntellectualCrafters - 2014.
 * You are not allowed to distribute and/or monetize any of our intellectual property.
 * IntellectualCrafters is not affiliated with Mojang AB. Minecraft is a trademark of Mojang AB.
 *
 * >> File = Command.java
 * >> Generated by: Citymonstret at 2014-08-09 01:41
 */

package com.intellectualcrafters.plot.commands;

/**
 * Created by Citymonstret on 2014-08-03.
 * 
 * @author Citymonstret
 */
public enum Command {
    /**
     *
     */
    HELPERS("helpers", "hp"),
    /**
     *
     */
    DENIED("denied", "dn"),
    /**
     *
     */
    CLAIM("claim", "c"),
    /**
    *
    */
    MERGE("merge", "m"),
    /**
    *
    */
    UNLINK("unlink", "u"),
    /**
    *
    */
    CLEAR("clear", "clear", new CommandPermission("plots.clear")),
    /**
     * 
     */
    DELETE("delete", "d", new CommandPermission("plots.clear.delete")),
    /**
     *
     */
    DEBUG("debug", "database", new CommandPermission("plots.admin")),
    /**
     *
     */
    HOME("home", "h"),
    /**
     *
     */
    INFO("info", "i"),
    /**
     *
     */
    LIST("list", "l"),
    /**
     *
     */
    SET("set", "s"),
    /**
     *
     */
    TP("tp", "tp");
    /**
     *
     */
    private String command;
    /**
     *
     */
    private String alias;
    /**
     *
     */
    private CommandPermission permission;

    /**
     * 
     * @param command
     */
    Command(String command) {
        this.command = command;
        this.alias = command;
        this.permission = new CommandPermission("plots." + command);
    }

    /**
     * 
     * @param command
     * @param permission
     */
    Command(String command, CommandPermission permission) {
        this.command = command;
        this.permission = permission;
        this.alias = command;
    }

    /**
     * 
     * @param command
     * @param alias
     */
    Command(String command, String alias) {
        this.command = command;
        this.alias = alias;
        this.permission = new CommandPermission("plots." + command);
    }

    /**
     * 
     * @param Command
     * @param alias
     * @param permission
     */
    Command(String command, String alias, CommandPermission permission) {
        this.command = command;
        this.alias = alias;
        this.permission = permission;
    }

    /**
     * 
     * @return
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * 
     * @return
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * 
     * @return
     */
    public CommandPermission getPermission() {
        return this.permission;
    }
}
