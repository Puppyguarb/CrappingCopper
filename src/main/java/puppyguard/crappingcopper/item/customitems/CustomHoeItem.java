package puppyguard.crappingcopper.item.customitems;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

//Literally only exists because the tool's constructor is protected.
public class CustomHoeItem extends HoeItem {
    public CustomHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
