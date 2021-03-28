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
        /*
            POWERED RAIL
         */

        final ShapedRecipe rail = new ShapedRecipe(new NamespacedKey(this, "emc_powered_rail"), new ItemStack(Material.POWERED_RAIL, 16));
        rail.shape("I I", "ISI", "IRI");
        rail.setIngredient('I', Material.IRON_INGOT);
        rail.setIngredient('S', Material.STICK);
        rail.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(rail);

        /*
            WEB
         */

        final ShapedRecipe web = new ShapedRecipe(new NamespacedKey(this, "emc_powered_web"), new ItemStack(Material.COBWEB, 1));
        web.shape("WWW", "WWW", "WWW");
        web.setIngredient('W', Material.STRING);
        Bukkit.addRecipe(web);

        /*
            INK SAC
         */

        final ShapelessRecipe inkSac = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac"), new ItemStack(Material.INK_SAC, 1));
        inkSac.addIngredient(Material.COAL);
        Bukkit.addRecipe(inkSac);

        final ShapelessRecipe inkSac2 = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac2"), new ItemStack(Material.INK_SAC, 2));
        inkSac2.addIngredient(Material.CHARCOAL);
        Bukkit.addRecipe(inkSac2);

        /*
            PRISMARINE
         */

        final ShapelessRecipe prismarineshard = new ShapelessRecipe(new NamespacedKey(this, "emc_prismarine_shard"), new ItemStack(Material.PRISMARINE_SHARD, 1));
        prismarineshard.addIngredient(Material.SAND);
        prismarineshard.addIngredient(Material.DIRT);
        prismarineshard.addIngredient(Material.LAPIS_LAZULI);
        Bukkit.addRecipe(prismarineshard);

        final ShapelessRecipe prismarineCrystals = new ShapelessRecipe(new NamespacedKey(this, "emc_prismarine_crystals"), new ItemStack(Material.PRISMARINE_CRYSTALS, 1));
        prismarineCrystals.addIngredient(Material.PRISMARINE_SHARD);
        prismarineCrystals.addIngredient(Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(prismarineCrystals);

        /*
            PACKED ICE
         */

        final ShapedRecipe packedice = new ShapedRecipe(new NamespacedKey(this, "emc_packedice"), new ItemStack(Material.PACKED_ICE, 3));
        packedice.shape("III", "III", "III");
        packedice.setIngredient('I', Material.ICE);
        Bukkit.addRecipe(packedice);

        final ShapedRecipe blueice = new ShapedRecipe(new NamespacedKey(this, "emc_blueice"), new ItemStack(Material.BLUE_ICE, 3));
        blueice.shape("III", "III", "III");
        blueice.setIngredient('I', Material.PACKED_ICE);
        Bukkit.addRecipe(blueice);

        /*
            CORAL
         */

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

        /*
            END STONE
         */

        final ShapedRecipe endstone = new ShapedRecipe(new NamespacedKey(this, "emc_endstone"), new ItemStack(Material.END_STONE, 1));
        endstone.shape("SSS", "SCS", "SSS");
        endstone.setIngredient('C', Material.COBBLESTONE);
        endstone.setIngredient('S', Material.SAND);
        Bukkit.addRecipe(endstone);

        /*
            LILYPADS
         */

        final ShapedRecipe lilypad = new ShapedRecipe(new NamespacedKey(this, "emc_lilypad1"), new ItemStack(Material.LILY_PAD, 3));
        lilypad.shape("L L", "LLL", "LLL");
        lilypad.setIngredient('L', Material.ACACIA_LEAVES);
        Bukkit.addRecipe(lilypad);

        final ShapedRecipe lilypad2 = new ShapedRecipe(new NamespacedKey(this, "emc_lilypad2"), new ItemStack(Material.LILY_PAD, 3));
        lilypad2.shape("L L", "LLL", "LLL");
        lilypad2.setIngredient('L', Material.BIRCH_LEAVES);
        Bukkit.addRecipe(lilypad2);

        final ShapedRecipe lilypad3 = new ShapedRecipe(new NamespacedKey(this, "emc_lilypad3"), new ItemStack(Material.LILY_PAD, 3));
        lilypad3.shape("L L", "LLL", "LLL");
        lilypad3.setIngredient('L', Material.DARK_OAK_LEAVES);
        Bukkit.addRecipe(lilypad3);

        final ShapedRecipe lilypad4 = new ShapedRecipe(new NamespacedKey(this, "emc_lilypad4"), new ItemStack(Material.LILY_PAD, 3));
        lilypad4.shape("L L", "LLL", "LLL");
        lilypad4.setIngredient('L', Material.JUNGLE_LEAVES);
        Bukkit.addRecipe(lilypad4);

        final ShapedRecipe lilypad5 = new ShapedRecipe(new NamespacedKey(this, "emc_lilypad5"), new ItemStack(Material.LILY_PAD, 3));
        lilypad5.shape("L L", "LLL", "LLL");
        lilypad5.setIngredient('L', Material.OAK_LEAVES);
        Bukkit.addRecipe(lilypad5);

        final ShapedRecipe lilypad6 = new ShapedRecipe(new NamespacedKey(this, "emc_lilypad6"), new ItemStack(Material.LILY_PAD, 3));
        lilypad6.shape("L L", "LLL", "LLL");
        lilypad6.setIngredient('L', Material.SPRUCE_LEAVES);
        Bukkit.addRecipe(lilypad6);


        /*
            VINES
         */

        final ShapedRecipe vines = new ShapedRecipe(new NamespacedKey(this, "emc_vines1"), new ItemStack(Material.VINE, 3));
        vines.shape("L L", "LLL", "L L");
        vines.setIngredient('L', Material.ACACIA_LEAVES);
        Bukkit.addRecipe(vines);

        final ShapedRecipe vines2 = new ShapedRecipe(new NamespacedKey(this, "emc_vines2"), new ItemStack(Material.VINE, 3));
        vines2.shape("L L", "LLL", "L L");
        vines2.setIngredient('L', Material.BIRCH_LEAVES);
        Bukkit.addRecipe(vines2);

        final ShapedRecipe vines3 = new ShapedRecipe(new NamespacedKey(this, "emc_vines3"), new ItemStack(Material.VINE, 3));
        vines3.shape("L L", "LLL", "L L");
        vines3.setIngredient('L', Material.DARK_OAK_LEAVES);
        Bukkit.addRecipe(vines3);

        final ShapedRecipe vines4 = new ShapedRecipe(new NamespacedKey(this, "emc_vines4"), new ItemStack(Material.VINE, 3));
        vines4.shape("L L", "LLL", "L L");
        vines4.setIngredient('L', Material.JUNGLE_LEAVES);
        Bukkit.addRecipe(vines4);

        final ShapedRecipe vines5 = new ShapedRecipe(new NamespacedKey(this, "emc_vines5"), new ItemStack(Material.VINE, 3));
        vines5.shape("L L", "LLL", "L L");
        vines5.setIngredient('L', Material.OAK_LEAVES);
        Bukkit.addRecipe(vines5);

        final ShapedRecipe vines6 = new ShapedRecipe(new NamespacedKey(this, "emc_vines6"), new ItemStack(Material.VINE, 3));
        vines6.shape("L L", "LLL", "L L");
        vines6.setIngredient('L', Material.SPRUCE_LEAVES);
        Bukkit.addRecipe(vines6);

        /*
            END ROD
         */

        final ShapedRecipe endRod = new ShapedRecipe(new NamespacedKey(this, "emc_endrod"), new ItemStack(Material.END_ROD, 1));
        endRod.shape("GWG", "GWG", "GWG");
        endRod.setIngredient('G', Material.GLOWSTONE_DUST);
        endRod.setIngredient('W', Material.WHITE_STAINED_GLASS);
        Bukkit.addRecipe(endRod);

        /*
            SAND STONE
         */

        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_SANDSTONE, 1), Material.SANDSTONE));
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_RED_SANDSTONE, 1), Material.RED_SANDSTONE));
        
        /*
            POPPED CHORUS FRUIT
         */

        final ShapelessRecipe poppedchorusfruit = new ShapelessRecipe(new NamespacedKey(this, "emc_poppedchorusfruit"), new ItemStack(Material.POPPED_CHORUS_FRUIT, 4));
        poppedChorusFruit.shape("E ", "M ");
        poppedChorusFruit.setIngredient('E', Material.EYE_OF_ENDER);
        poppedChorusFruit.setIngredient('M', Material.PHANTOM_MEMBRANE);
        Bukkit.addRecipe(poppedchorusfruit);
    }
}
