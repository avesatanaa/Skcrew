package com.lotzy.skcrew.spigot.sockets.elements.types;

import ch.njol.skript.classes.ClassInfo;
import ch.njol.skript.classes.Parser;
import ch.njol.skript.expressions.base.EventValueExpression;
import ch.njol.skript.lang.ParseContext;
import ch.njol.skript.registrations.Classes;
import com.lotzy.skcrew.shared.sockets.data.SpigotPlayer;
import com.lotzy.skcrew.spigot.Skcrew;
import org.bukkit.OfflinePlayer;

public class TypeNetworkPlayer {

    public static void register() {


        Classes.registerClass(new ClassInfo<>(SpigotPlayer.class, "networkplayer")
                .defaultExpression(new EventValueExpression<>(SpigotPlayer.class))
                .user("net[work] ?players?")
                .name("networkplayer")
                .description("Represents a network player (com.lotzy.skcrew.shared.sockets.data.SpigotPlayer class)")
                .since("3.0")
                .parser(new Parser<SpigotPlayer>() {
                    @Override
                    public SpigotPlayer parse(String name, ParseContext context) {
                        return null;
                    }

                    @Override
                    public boolean canParse(ParseContext context) {
                        return false;
                    }

                    @Override
                    public String toString(SpigotPlayer player, int flags) {
                        return player.getName();
                    }

                    @Override
                    public String toVariableNameString(SpigotPlayer player) {
                        return player.getName();
                    }
                }));
    }
}
