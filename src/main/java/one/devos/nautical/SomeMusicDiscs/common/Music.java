package one.devos.nautical.SomeMusicDiscs.common;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import one.devos.nautical.SomeMusicDiscs.SomeMusicDiscs;

public class Music {
    // Carter's Music
    public static final SoundEvent SOUND_BOMBS_AND_BASS = register("disc.bombs_and_bass");
    public static final SoundEvent SOUND_TRIAL1 = register("disc.trial1");
    public static final SoundEvent SOUND_TRILLBIT = register("disc.trillbit");

    // Cursed Music
    public static final SoundEvent SOUND_AUTOTUNED_SPANISH_FLEA = register("disc.autotuned_spanish_flea");
    public static final SoundEvent SOUND_YAKETY_SAX = register("disc.yakety_sax");

    public static SoundEvent register(String name) {
        ResourceLocation resourceLocation = new ResourceLocation(SomeMusicDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, resourceLocation, new SoundEvent(resourceLocation));
    }
    public static void init() {
        SomeMusicDiscs.LOGGER.info("[" + SomeMusicDiscs.MOD_NAME + "] Music Initialized" );
    }
}