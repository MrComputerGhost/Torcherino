package com.sci.torcherino.commands;

import com.mojang.authlib.GameProfile;
import com.sci.torcherino.lib.Props;
import cpw.mods.fml.relauncher.FMLInjectionData;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MrComputerGhost
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CommandTorcherino implements ICommand {

    @Override
    public String getCommandName() {
        return "torcherino";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "torcherino <torchLocations|torchCount>";
    }

    @Override
    public List getCommandAliases() {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        File torcherino = new File((FMLInjectionData.data()[6]).toString() + "/Torcherino/" + MinecraftServer.getServer().getWorldName());
        if (args[0].equals("torchLocations")) {
            try {
                if (FileUtils.readLines(torcherino).size() > 1)
                    sender.addChatMessage(new ChatComponentText(FileUtils.readLines(torcherino).size() + " Torcherinos at: "));
                else if (FileUtils.readLines(torcherino).size() == 1)
                    sender.addChatMessage(new ChatComponentText("1 Torcherino at: "));
                else if (FileUtils.readLines(torcherino).size() < 1) {
                    sender.addChatMessage(new ChatComponentText("No Torcherinos Found"));
                }
                for (String c : FileUtils.readLines(torcherino)) {
                    sender.addChatMessage(new ChatComponentText(c));
                }
            } catch (IOException e) {
                e.printStackTrace();
                sender.addChatMessage(new ChatComponentText("No Torcherinos Found"));
            }
        } else if (args[0].equals("torchCount")) {
            try {
                if (FileUtils.readLines(torcherino).size() > 1)
                    sender.addChatMessage(new ChatComponentText("There are currently " + FileUtils.readLines(torcherino).size() + " Torcherinos in the world"));
                if (FileUtils.readLines(torcherino).size() == 1)
                    sender.addChatMessage(new ChatComponentText("There is currently 1 Torcherino in the world"));
                if (FileUtils.readLines(torcherino).size() < 1)
                    sender.addChatMessage(new ChatComponentText("There are currently no Torcherinos in the world"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            sender.addChatMessage(new ChatComponentText("Invalid Arguments"));
        }
    }

    @Override
    public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_) {
        List<String> foo = new ArrayList<String>();
        foo.add("torchLocations");
        foo.add("torchCount");
        return foo;
    }

    @Override
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
        return false;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return sender instanceof EntityPlayer && MinecraftServer.getServer().getConfigurationManager().func_152596_g(new GameProfile(((EntityPlayer) sender).getUniqueID(), ((EntityPlayer) sender).getDisplayName()));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
