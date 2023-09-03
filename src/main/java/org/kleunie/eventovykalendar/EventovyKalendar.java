package org.kleunie.eventovykalendar;

import org.bukkit.plugin.java.JavaPlugin;

public final class EventovyKalendar extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Kalendar se nacita...");

    }

    @Override
    public void onDisable() {
        System.out.println("Kalendar se vypina...");
    }
}
