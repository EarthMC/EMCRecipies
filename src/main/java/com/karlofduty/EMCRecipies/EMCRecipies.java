package com.karlofduty.EMCRecipies;

import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.*;
import org.bukkit.plugin.*;
import org.bukkit.*;

public class EMCRecipies extends JavaPlugin
{
    public void onEnable()
    {
        final ShapedRecipe rail = new ShapedRecipe(new NamespacedKey(this, "emc_powered_rail"), new ItemStack(Material.POWERED_RAIL, 16));
        rail.shape("I I", "ISI", "IRI");
        rail.setIngredient('I', Material.IRON_INGOT);
        rail.setIngredient('S', Material.STICK);
        rail.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(rail);

        final ShapedRecipe web = new ShapedRecipe(new NamespacedKey(this, "emc_powered_web"), new ItemStack(Material.COBWEB, 1));
        web.shape("WWW", "WWW", "WWW");
        web.setIngredient('W', Material.STRING);
        Bukkit.addRecipe(web);

        final ShapelessRecipe inkSac = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac"), new ItemStack(Material.INK_SAC, 1));
        inkSac.addIngredient(Material.COAL);
        Bukkit.addRecipe(inkSac);

        final ShapelessRecipe inkSac2 = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac2"), new ItemStack(Material.INK_SAC, 2));
        inkSac2.addIngredient(Material.CHARCOAL);
        Bukkit.addRecipe(inkSac2);

        final ShapelessRecipe prismarineshard = new ShapelessRecipe(new NamespacedKey(this, "emc_prismarine_shard"), new ItemStack(Material.PRISMARINE_SHARD, 1));
        prismarineshard.addIngredient(Material.SAND);
        prismarineshard.addIngredient(Material.DIRT);
        prismarineshard.addIngredient(Material.LAPIS_LAZULI);
        Bukkit.addRecipe(prismarineshard);

        final ShapelessRecipe prismarineCrystals = new ShapelessRecipe(new NamespacedKey(this, "emc_prismarine_crystals"), new ItemStack(Material.PRISMARINE_CRYSTALS, 1));
        prismarineCrystals.addIngredient(Material.PRISMARINE_SHARD);
        prismarineCrystals.addIngredient(Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(prismarineCrystals);

        final ShapedRecipe packedice = new ShapedRecipe(new NamespacedKey(this, "emc_packedice"), new ItemStack(Material.PACKED_ICE, 3));
        packedice.shape("III", "III", "III");
        packedice.setIngredient('I', Material.ICE);
        Bukkit.addRecipe(packedice);

        final ShapedRecipe blueice = new ShapedRecipe(new NamespacedKey(this, "emc_blueice"), new ItemStack(Material.BLUE_ICE, 3));
        blueice.shape("III", "III", "III");
        blueice.setIngredient('I', Material.PACKED_ICE);
        Bukkit.addRecipe(blueice);

        final ShapedRecipe firecoral = new ShapedRecipe(new NamespacedKey(this, "emc_firecoral"), new ItemStack(Material.FIRE_CORAL_BLOCK, 1));
        firecoral.shape("CC", "CC");
        firecoral.setIngredient('C', Material.FIRE_CORAL);
        Bukkit.addRecipe(firecoral);

        final ShapedRecipe braincoral = new ShapedRecipe(new NamespacedKey(this, "emc_braincoral"), new ItemStack(Material.BRAIN_CORAL_BLOCK, 1));
        braincoral.shape("CC", "CC");
        braincoral.setIngredient('C', Material.BRAIN_CORAL);
        Bukkit.addRecipe(braincoral);

        final ShapedRecipe tubecoral = new ShapedRecipe(new NamespacedKey(this, "emc_tubecoral"), new ItemStack(Material.TUBE_CORAL_BLOCK, 1));
        tubecoral.shape("CC", "CC");
        tubecoral.setIngredient('C', Material.TUBE_CORAL);
        Bukkit.addRecipe(tubecoral);

        final ShapedRecipe horncoral = new ShapedRecipe(new NamespacedKey(this, "emc_horncoral"), new ItemStack(Material.HORN_CORAL_BLOCK, 1));
        horncoral.shape("CC", "CC");
        horncoral.setIngredient('C', Material.HORN_CORAL);
        Bukkit.addRecipe(horncoral);

        final ShapedRecipe bubblecoral = new ShapedRecipe(new NamespacedKey(this, "emc_bubblecoral"), new ItemStack(Material.BUBBLE_CORAL_BLOCK, 1));
        bubblecoral.shape("CC", "CC");
        bubblecoral.setIngredient('C', Material.BUBBLE_CORAL);
        Bukkit.addRecipe(bubblecoral);

        final ShapedRecipe endstone = new ShapedRecipe(new NamespacedKey(this, "emc_endstone"), new ItemStack(Material.END_STONE, 1));
        endstone.shape("SSS", "SCS", "SSS");
        endstone.setIngredient('C', Material.COBBLESTONE);
        endstone.setIngredient('S', Material.SAND);
        Bukkit.addRecipe(endstone);

        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_SANDSTONE, 1), Material.SANDSTONE));
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_RED_SANDSTONE, 1), Material.RED_SANDSTONE));
    }
}
