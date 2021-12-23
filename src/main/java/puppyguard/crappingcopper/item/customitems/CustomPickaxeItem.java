package puppyguard.crappingcopper.item.customitems;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

//Literally only exists because the tool's constructor is protected.
public class CustomPickaxeItem extends PickaxeItem {
    public CustomPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
