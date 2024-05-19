package cn.wode490390.nukkit.brandgen;

import cn.nukkit.level.generator.Generator;
import cn.nukkit.plugin.PluginBase;
import cn.wode490390.nukkit.brandgen.util.MetricsLite;

public class CreeperFaceGeneratorPlugin extends PluginBase {

    @Override
    public void onEnable() {
        try {
            new MetricsLite(this, 6996);
        } catch (Throwable ignore) {

        }

        Generator.addGenerator(CreeperFaceGenerator.class, "creeper", Generator.TYPE_INFINITE);
    }
}
