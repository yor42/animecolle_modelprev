package yor42.animearsenal.gameobject.Items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import yor42.animearsenal.init.ItemInit;

import javax.annotation.Nullable;
import java.util.List;

import static truefantasy.animcolle.Main.animcolleweapon;

public class compoundBow extends ItemBow {
    public compoundBow(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(animcolleweapon);
        setMaxStackSize(1);

        ItemInit.ITEM_LIST.add(this);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentTranslation(this.getUnlocalizedName()+".tooltip").getFormattedText());
    }
}
