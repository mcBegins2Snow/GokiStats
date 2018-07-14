package net.infstudio.goki.lib;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;

public class Reference {
    public static final String MOD_ID = "gokistats";
    public static final String MOD_NAME = "gokistats";
    public static final String VERSION = "1.0.0";
    public static final String CONFIGURATION_VERSION = "v1";
    public static final ResourceLocation RPG_ICON_TEXTURE_LOCATION = new ResourceLocation("gokistats".toLowerCase(), "textures/rpg_icons.png");
    public static final ResourceLocation RPG_ICON_2_TEXTURE_LOCATION = new ResourceLocation("gokistats".toLowerCase(), "textures/rpg_icons_2.png");
    public static final ResourceLocation PARTICLES_TEXTURE = new ResourceLocation("gokistats".toLowerCase(), "textures/particles.png");
    public static final String STAT_TAG = "gokistats_Stats";
    public static Configuration configuration;
    public static boolean isPlayerAPILoaded = false;
}