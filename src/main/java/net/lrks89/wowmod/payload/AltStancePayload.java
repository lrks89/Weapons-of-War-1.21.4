package net.lrks89.wowmod.payload;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record AltStancePayload() implements CustomPayload {
    public static final Id<AltStancePayload> ID = new Id<>(Identifier.of("your_mod_id", "switch_stance"));
    public static final PacketCodec<PacketByteBuf, AltStancePayload> CODEC = PacketCodec.unit(new AltStancePayload());

    @Override
    public Id<AltStancePayload> getId() {
        return ID;
    }
}
