package com.lotzy.skcrew.spigot.other;

import ch.njol.skript.Skript;
import ch.njol.skript.doc.Description;
import ch.njol.skript.doc.Examples;
import ch.njol.skript.doc.Name;
import ch.njol.skript.doc.Since;
import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.registrations.EventValues;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;

@Name("Other - inventory drag event")
@Description("Run when player hold right-click with cursor item in inventory")
@Examples({"on inventory drag:",
        "\tbroadcast \"%player% %event-inventory%\""})
@Since("1.0")
public class EvtInventoryDrag extends SkriptEvent {
    static {
        Skript.registerEvent("InventoryDrag", EvtInventoryDrag.class, InventoryDragEvent.class, "inventory drag");


        EventValues.registerEventValue(InventoryDragEvent.class, Player.class, event -> (Player) event.getWhoClicked(), 0);
        EventValues.registerEventValue(InventoryDragEvent.class, Inventory.class, InventoryDragEvent::getInventory, 0);
    }

    @Override
    public boolean init(final Literal<?>[] args, final int matchedPattern, final ParseResult parser) {
        return true;
    }

    @Override
    public String toString(final Event e, final boolean debug) {
        return "inventory drag";
    }

    @Override
    public boolean check(Event e) {
        return true;
    }
}
