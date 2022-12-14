package net.tonimatasdev.packetsizedoublerforge.mixin;

import net.minecraft.network.play.client.CCustomPayloadPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CCustomPayloadPacket.class)
public class CCustomPayloadPacketMixin {
    @ModifyConstant(method = "read", constant = @Constant(intValue = 32767))
    private int packetDoubler(int value) {
        return value*10;
    }
}
