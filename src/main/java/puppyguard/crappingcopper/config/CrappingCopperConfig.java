package puppyguard.crappingcopper.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "crappingcopper")
public class CrappingCopperConfig extends PartitioningSerializer.GlobalData  {
    public Settings SETTINGS = new Settings();

    @Config(name = "settings")
    public static class Settings implements ConfigData {
        @Comment("\nDisabling any items will cause them to disappear in existing worlds, so keep that in mind.\n" +
                "\n==========\n"
                +"Tiers\n"
                +"==========\n"
                +"WARNING: Disabling a lower tier will disable tiers & items above it " +
                "\n(I.E., disabling hyper dense copper disables transcended copper and its items)")
        public boolean enableCompressedCopper = true;
        public boolean enableHyperDenseCopper = true;
        public boolean enableTranscendedCopper = true;

        @Comment("\n==========\n"
                  +"Hammers\n"
                  +"==========")
        public boolean enableCopperHammer = true;
        public boolean enableCompressedCopperHammer = true;
        public boolean enableHyperDenseCopperHammer = true;
        public boolean enableTranscendedCopperHammer = true;

        @Comment("\n==========\n"
                +"Tools\n"
                +"==========\n"
                +"Note: Disabling tools does not disable hammers, there's an option above for that.")
        public boolean enableCompressedCopperTools = true;
        public boolean enableHyperDenseCopperTools = true;
        public boolean enableTranscendedCopperTools = true;

        @Comment("\n==========\n"
                +"Armor\n"
                +"==========\n")
        public boolean enableCompressedCopperArmor = true;
        public boolean enableHyperDenseCopperArmor = true;
        public boolean enableTranscendedCopperArmor = true;

        @Comment("\n==========\n"
                +"Misc\n"
                +"==========")
        public boolean enableCopperFeather = true;
    }
}
