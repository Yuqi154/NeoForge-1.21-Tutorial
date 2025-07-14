package org.hiedacamellia.tutorial;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.hiedacamellia.tutorial.registries.TutorialItem;
import org.slf4j.Logger;

@Mod(Tutorial.MODID)
public class Tutorial {

    public static final String MODID = "tutorial";

    public static final Logger LOGGER = LogUtils.getLogger();

    public Tutorial(IEventBus modEventBus, ModContainer modContainer) {
        TutorialItem.ITEMS.register(modEventBus);
    }

}
