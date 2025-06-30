package com.aeternal.spectralconverters.container;


import com.aeternal.spectralconverters.tiles.TileSpectralConverter;
import com.denfop.container.ContainerFullInv;
import com.denfop.container.SlotInvSlot;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerSpectralConverter extends ContainerFullInv<TileSpectralConverter> {

    public final EntityPlayer entityPlayer;

    public ContainerSpectralConverter(EntityPlayer entityPlayer, TileSpectralConverter tileEntity) {
        super(entityPlayer, tileEntity, 176);
        this.entityPlayer = entityPlayer;
        for (int k = 0; k < 4; k++) {
            addSlotToContainer(new SlotInvSlot(tileEntity.upgradeSlot, k, 152, 17 + k * 18));
        }
    }

    public void onContainerClosed(EntityPlayer playerIn) {
        this.base.list.remove(playerIn);
        super.onContainerClosed(playerIn);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

}
