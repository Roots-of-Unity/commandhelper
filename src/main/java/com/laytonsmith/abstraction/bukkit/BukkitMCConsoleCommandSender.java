/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.abstraction.bukkit;

import com.laytonsmith.abstraction.MCConsoleCommandSender;
import org.bukkit.command.ConsoleCommandSender;

/**
 *
 * @author layton
 */
public class BukkitMCConsoleCommandSender extends BukkitMCCommandSender implements MCConsoleCommandSender{

    ConsoleCommandSender ccs;
    public BukkitMCConsoleCommandSender(ConsoleCommandSender ccs){
        super(ccs);
        this.ccs = ccs;
    }
    
}
