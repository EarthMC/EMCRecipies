package com.karlofduty.EMCRecipies;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class EMCRecipies extends JavaPlugin
{
    public void onEnable()
    {
        final ShapedRecipe rail = new ShapedRecipe(new NamespacedKey(this, "emc_powered_rail"), new ItemStack(Material.POWERED_RAIL, 16));
        rail.shape(new String[] { "I I", "ISI", "IRI" });
        rail.setIngredient('I', Material.IRON_INGOT);
        rail.setIngredient('S', Material.STICK);
        rail.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(rail);

        final ShapedRecipe web = new ShapedRecipe(new NamespacedKey(this, "emc_powered_web"), new ItemStack(Material.COBWEB, 1));
        web.shape(new String[] { "WWW", "WWW", "WWW" });
        web.setIngredient('W', Material.STRING);
        Bukkit.addRecipe(web);

        final ShapedRecipe endstone = new ShapedRecipe(new NamespacedKey(this, "emc_endstone"), new ItemStack(Material.END_STONE, 4));
        endstone.shape(new String[] { "SS", "SS" });
        endstone.setIngredient('S', Material.SMOOTH_SANDSTONE);
        Bukkit.addRecipe(endstone);

        final ShapelessRecipe inkSac = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac"), new ItemStack(Material.INK_SAC, 1));
        inkSac.addIngredient(Material.COAL);
        Bukkit.addRecipe(inkSac);

        final ShapelessRecipe inkSac2 = new ShapelessRecipe(new NamespacedKey((Plugin)this, "emc_ink_sac2"), new ItemStack(Material.INK_SAC, 2));
        inkSac2.addIngredient(Material.CHARCOAL);
        Bukkit.addRecipe(inkSac2);

        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_SANDSTONE, 1), Material.SANDSTONE));
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_RED_SANDSTONE, 1), Material.RED_SANDSTONE));
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_STONE, 1), Material.STONE));
    }

}
