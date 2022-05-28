package com.karlofduty.EMCRecipies;

import io.papermc.paper.event.server.ServerResourcesReloadedEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class EMCRecipies extends JavaPlugin implements Listener
{
    public void onEnable()
    {
        Bukkit.getPluginManager().registerEvents(this, this);
        registerRecipes();
    }

    // Called when datapacks/recipes are reloaded, recipes will have to be registered again.
    @EventHandler
    public void onResourcesReload(ServerResourcesReloadedEvent event)
    {
        registerRecipes();
    }

    public void registerRecipes() {
        // POWERED RAIL
        final ShapedRecipe rail = new ShapedRecipe(new NamespacedKey(this, "emc_powered_rail"), new ItemStack(Material.POWERED_RAIL, 16));
        rail.shape("I I", "ISI", "IRI");
        rail.setIngredient('I', Material.IRON_INGOT);
        rail.setIngredient('S', Material.STICK);
        rail.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(rail);

        // WEB
        final ShapedRecipe web = new ShapedRecipe(new NamespacedKey(this, "emc_powered_web"), new ItemStack(Material.COBWEB, 1));
        web.shape("WWW", "WWW", "WWW");
        web.setIngredient('W', Material.STRING);
        Bukkit.addRecipe(web);

        // INK SAC
        final ShapelessRecipe inkSac = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac"), new ItemStack(Material.INK_SAC, 1));
        inkSac.addIngredient(Material.COAL);
        Bukkit.addRecipe(inkSac);

        final ShapelessRecipe inkSac2 = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac2"), new ItemStack(Material.INK_SAC, 2));
        inkSac2.addIngredient(Material.CHARCOAL);
        Bukkit.addRecipe(inkSac2);

        // PRISMARINE
        final ShapelessRecipe prismarineshard = new ShapelessRecipe(new NamespacedKey(this, "emc_prismarine_shard"), new ItemStack(Material.PRISMARINE_SHARD, 1));
        prismarineshard.addIngredient(Material.SAND);
        prismarineshard.addIngredient(Material.DIRT);
        prismarineshard.addIngredient(Material.LAPIS_LAZULI);
        Bukkit.addRecipe(prismarineshard);

        final ShapelessRecipe prismarineCrystals = new ShapelessRecipe(new NamespacedKey(this, "emc_prismarine_crystals"), new ItemStack(Material.PRISMARINE_CRYSTALS, 1));
        prismarineCrystals.addIngredient(Material.PRISMARINE_SHARD);
        prismarineCrystals.addIngredient(Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(prismarineCrystals);

        // PACKED ICE
        final ShapedRecipe packedice = new ShapedRecipe(new NamespacedKey(this, "emc_packedice"), new ItemStack(Material.PACKED_ICE, 3));
        packedice.shape("III", "III", "III");
        packedice.setIngredient('I', Material.ICE);
        Bukkit.addRecipe(packedice);

        final ShapedRecipe blueice = new ShapedRecipe(new NamespacedKey(this, "emc_blueice"), new ItemStack(Material.BLUE_ICE, 3));
        blueice.shape("III", "III", "III");
        blueice.setIngredient('I', Material.PACKED_ICE);
        Bukkit.addRecipe(blueice);

        // CORAL
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

        // END STONE
        final ShapedRecipe endstone = new ShapedRecipe(new NamespacedKey(this, "emc_endstone"), new ItemStack(Material.END_STONE, 8));
        endstone.shape("SSS", "SCS", "SSS");
        endstone.setIngredient('C', Material.COBBLESTONE);
        endstone.setIngredient('S', Material.SAND);
        Bukkit.addRecipe(endstone);

        // LILYPADS
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


        // VINES
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

        // END ROD
        final ShapedRecipe endRod = new ShapedRecipe(new NamespacedKey(this, "emc_endrod"), new ItemStack(Material.END_ROD, 1));
        endRod.shape("GWG", "GWG", "GWG");
        endRod.setIngredient('G', Material.GLOWSTONE_DUST);
        endRod.setIngredient('W', Material.WHITE_STAINED_GLASS);
        Bukkit.addRecipe(endRod);

        //WHITE CONCRETE POWDER (RED SAND)
        final ShapedRecipe whiteconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_whiteconcretepowder"), new ItemStack(Material.WHITE_CONCRETE_POWDER, 8));
        whiteconcretepowder.shape("DSS", "SSG", "GGG");
        whiteconcretepowder.setIngredient('D', Material.WHITE_DYE);
        whiteconcretepowder.setIngredient('S', Material.RED_SAND);
        whiteconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(whiteconcretepowder);

        //ORANGE CONCRETE POWDER (RED SAND)
        final ShapedRecipe orangeconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_orangeconcretepowder"), new ItemStack(Material.ORANGE_CONCRETE_POWDER, 8));
        orangeconcretepowder.shape("DSS", "SSG", "GGG");
        orangeconcretepowder.setIngredient('D', Material.ORANGE_DYE);
        orangeconcretepowder.setIngredient('S', Material.RED_SAND);
        orangeconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(orangeconcretepowder);

        //MAGENTA CONCRETE POWDER (RED SAND)
        final ShapedRecipe magentaconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_magentaconcretepowder"), new ItemStack(Material.MAGENTA_CONCRETE_POWDER, 8));
        magentaconcretepowder.shape("DSS", "SSG", "GGG");
        magentaconcretepowder.setIngredient('D', Material.MAGENTA_DYE);
        magentaconcretepowder.setIngredient('S', Material.RED_SAND);
        magentaconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(magentaconcretepowder);

        //LIGHT BLUE CONCRETE POWDER (RED SAND)
        final ShapedRecipe lightblueconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_lightblueconcretepowder"), new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER, 8));
        lightblueconcretepowder.shape("DSS", "SSG", "GGG");
        lightblueconcretepowder.setIngredient('D', Material.LIGHT_BLUE_DYE);
        lightblueconcretepowder.setIngredient('S', Material.RED_SAND);
        lightblueconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(lightblueconcretepowder);

        //YELLOW CONCRETE POWDER (RED SAND)
        final ShapedRecipe yellowconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_yellowconcretepowder"), new ItemStack(Material.YELLOW_CONCRETE_POWDER, 8));
        yellowconcretepowder.shape("DSS", "SSG", "GGG");
        yellowconcretepowder.setIngredient('D', Material.YELLOW_DYE);
        yellowconcretepowder.setIngredient('S', Material.RED_SAND);
        yellowconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(yellowconcretepowder);

        //LIME CONCRETE POWDER (RED SAND)
        final ShapedRecipe limeconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_limeconcretepowder"), new ItemStack(Material.LIME_CONCRETE_POWDER, 8));
        limeconcretepowder.shape("DSS", "SSG", "GGG");
        limeconcretepowder.setIngredient('D', Material.LIME_DYE);
        limeconcretepowder.setIngredient('S', Material.RED_SAND);
        limeconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(limeconcretepowder);

        //PINK CONCRETE POWDER (RED SAND)
        final ShapedRecipe pinkconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_pinkconcretepowder"), new ItemStack(Material.PINK_CONCRETE_POWDER, 8));
        pinkconcretepowder.shape("DSS", "SSG", "GGG");
        pinkconcretepowder.setIngredient('D', Material.PINK_DYE);
        pinkconcretepowder.setIngredient('S', Material.RED_SAND);
        pinkconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(pinkconcretepowder);

        //GRAY CONCRETE POWDER (RED SAND)
        final ShapedRecipe grayconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_grayconcretepowder"), new ItemStack(Material.GRAY_CONCRETE_POWDER, 8));
        grayconcretepowder.shape("DSS", "SSG", "GGG");
        grayconcretepowder.setIngredient('D', Material.GRAY_DYE);
        grayconcretepowder.setIngredient('S', Material.RED_SAND);
        grayconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(grayconcretepowder);

        //LIGHT GRAY CONCRETE POWDER (RED SAND)
        final ShapedRecipe lightgrayconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_lightgrayconcretepowder"), new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER, 8));
        lightgrayconcretepowder.shape("DSS", "SSG", "GGG");
        lightgrayconcretepowder.setIngredient('D', Material.LIGHT_GRAY_DYE);
        lightgrayconcretepowder.setIngredient('S', Material.RED_SAND);
        lightgrayconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(lightgrayconcretepowder);

        //CYAN CONCRETE POWDER (RED SAND)
        final ShapedRecipe cyanconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_cyanconcretepowder"), new ItemStack(Material.CYAN_CONCRETE_POWDER, 8));
        cyanconcretepowder.shape("DSS", "SSG", "GGG");
        cyanconcretepowder.setIngredient('D', Material.CYAN_DYE);
        cyanconcretepowder.setIngredient('S', Material.RED_SAND);
        cyanconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(cyanconcretepowder);

        //PURPLE CONCRETE POWDER (RED SAND)
        final ShapedRecipe purpleconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_purpleconcretepowder"), new ItemStack(Material.PURPLE_CONCRETE_POWDER, 8));
        purpleconcretepowder.shape("DSS", "SSG", "GGG");
        purpleconcretepowder.setIngredient('D', Material.PURPLE_DYE);
        purpleconcretepowder.setIngredient('S', Material.RED_SAND);
        purpleconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(purpleconcretepowder);

        //BLUE CONCRETE POWDER (RED SAND)
        final ShapedRecipe blueconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_blueconcretepowder"), new ItemStack(Material.BLUE_CONCRETE_POWDER, 8));
        blueconcretepowder.shape("DSS", "SSG", "GGG");
        blueconcretepowder.setIngredient('D', Material.BLUE_DYE);
        blueconcretepowder.setIngredient('S', Material.RED_SAND);
        blueconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(blueconcretepowder);

        //BROWN CONCRETE POWDER (RED SAND)
        final ShapedRecipe brownconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_brownconcretepowder"), new ItemStack(Material.BROWN_CONCRETE_POWDER, 8));
        brownconcretepowder.shape("DSS", "SSG", "GGG");
        brownconcretepowder.setIngredient('D', Material.BROWN_DYE);
        brownconcretepowder.setIngredient('S', Material.RED_SAND);
        brownconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(brownconcretepowder);

        //GREEN CONCRETE POWDER (RED SAND)
        final ShapedRecipe greenconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_greenconcretepowder"), new ItemStack(Material.GREEN_CONCRETE_POWDER, 8));
        greenconcretepowder.shape("DSS", "SSG", "GGG");
        greenconcretepowder.setIngredient('D', Material.GREEN_DYE);
        greenconcretepowder.setIngredient('S', Material.RED_SAND);
        greenconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(greenconcretepowder);

        //RED CONCRETE POWDER (RED SAND)
        final ShapedRecipe redconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_redconcretepowder"), new ItemStack(Material.RED_CONCRETE_POWDER, 8));
        redconcretepowder.shape("DSS", "SSG", "GGG");
        redconcretepowder.setIngredient('D', Material.RED_DYE);
        redconcretepowder.setIngredient('S', Material.RED_SAND);
        redconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(redconcretepowder);

        //BLACK CONCRETE POWDER (RED SAND)
        final ShapedRecipe blackconcretepowder = new ShapedRecipe(new NamespacedKey(this, "emc_blackconcretepowder"), new ItemStack(Material.BLACK_CONCRETE_POWDER, 8));
        blackconcretepowder.shape("DSS", "SSG", "GGG");
        blackconcretepowder.setIngredient('D', Material.BLACK_DYE);
        blackconcretepowder.setIngredient('S', Material.RED_SAND);
        blackconcretepowder.setIngredient('G', Material.GRAVEL);
        Bukkit.addRecipe(blackconcretepowder);

        // SAND STONE
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_SANDSTONE, 1), Material.SANDSTONE));
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_RED_SANDSTONE, 1), Material.RED_SANDSTONE));
    }
}
