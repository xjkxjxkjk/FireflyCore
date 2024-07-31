// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class DisplayAvatarDetailInfoOuterClass {
  /**
   * Protobuf type {@code DisplayAvatarDetailInfo}
   */
  public static final class DisplayAvatarDetailInfo extends ProtoMessage<DisplayAvatarDetailInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     */
    private int avatarId;

    /**
     * <code>optional uint32 pos = 5;</code>
     */
    private int pos;

    /**
     * <code>optional uint32 promotion = 6;</code>
     */
    private int promotion;

    /**
     * <code>optional uint32 level = 8;</code>
     */
    private int level;

    /**
     * <code>optional uint32 rank = 10;</code>
     */
    private int rank;

    /**
     * <code>optional uint32 exp = 12;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 dressed_skin_id = 14;</code>
     */
    private int dressedSkinId;

    /**
     * <code>optional .DisplayEquipmentInfo equipment = 15;</code>
     */
    private final DisplayEquipmentInfoOuterClass.DisplayEquipmentInfo equipment = DisplayEquipmentInfoOuterClass.DisplayEquipmentInfo.newInstance();

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 7;</code>
     */
    private final RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> skilltreeList = RepeatedMessage.newEmptyInstance(AvatarSkillTreeOuterClass.AvatarSkillTree.getFactory());

    /**
     * <code>repeated .DisplayRelicInfo relic_list = 13;</code>
     */
    private final RepeatedMessage<DisplayRelicInfoOuterClass.DisplayRelicInfo> relicList = RepeatedMessage.newEmptyInstance(DisplayRelicInfoOuterClass.DisplayRelicInfo.getFactory());

    private DisplayAvatarDetailInfo() {
    }

    /**
     * @return a new empty instance of {@code DisplayAvatarDetailInfo}
     */
    public static DisplayAvatarDetailInfo newInstance() {
      return new DisplayAvatarDetailInfo();
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @param value the avatarId to set
     * @return this
     */
    public DisplayAvatarDetailInfo setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 pos = 5;</code>
     * @return whether the pos field is set
     */
    public boolean hasPos() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 pos = 5;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearPos() {
      bitField0_ &= ~0x00000002;
      pos = 0;
      return this;
    }

    /**
     * <code>optional uint32 pos = 5;</code>
     * @return the pos
     */
    public int getPos() {
      return pos;
    }

    /**
     * <code>optional uint32 pos = 5;</code>
     * @param value the pos to set
     * @return this
     */
    public DisplayAvatarDetailInfo setPos(final int value) {
      bitField0_ |= 0x00000002;
      pos = value;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 6;</code>
     * @return whether the promotion field is set
     */
    public boolean hasPromotion() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 promotion = 6;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearPromotion() {
      bitField0_ &= ~0x00000004;
      promotion = 0;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 6;</code>
     * @return the promotion
     */
    public int getPromotion() {
      return promotion;
    }

    /**
     * <code>optional uint32 promotion = 6;</code>
     * @param value the promotion to set
     * @return this
     */
    public DisplayAvatarDetailInfo setPromotion(final int value) {
      bitField0_ |= 0x00000004;
      promotion = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearLevel() {
      bitField0_ &= ~0x00000008;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @param value the level to set
     * @return this
     */
    public DisplayAvatarDetailInfo setLevel(final int value) {
      bitField0_ |= 0x00000008;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 rank = 10;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 rank = 10;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearRank() {
      bitField0_ &= ~0x00000010;
      rank = 0;
      return this;
    }

    /**
     * <code>optional uint32 rank = 10;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <code>optional uint32 rank = 10;</code>
     * @param value the rank to set
     * @return this
     */
    public DisplayAvatarDetailInfo setRank(final int value) {
      bitField0_ |= 0x00000010;
      rank = value;
      return this;
    }

    /**
     * <code>optional uint32 exp = 12;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 exp = 12;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearExp() {
      bitField0_ &= ~0x00000020;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 12;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 12;</code>
     * @param value the exp to set
     * @return this
     */
    public DisplayAvatarDetailInfo setExp(final int value) {
      bitField0_ |= 0x00000020;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 14;</code>
     * @return whether the dressedSkinId field is set
     */
    public boolean hasDressedSkinId() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 14;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearDressedSkinId() {
      bitField0_ &= ~0x00000040;
      dressedSkinId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 14;</code>
     * @return the dressedSkinId
     */
    public int getDressedSkinId() {
      return dressedSkinId;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 14;</code>
     * @param value the dressedSkinId to set
     * @return this
     */
    public DisplayAvatarDetailInfo setDressedSkinId(final int value) {
      bitField0_ |= 0x00000040;
      dressedSkinId = value;
      return this;
    }

    /**
     * <code>optional .DisplayEquipmentInfo equipment = 15;</code>
     * @return whether the equipment field is set
     */
    public boolean hasEquipment() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .DisplayEquipmentInfo equipment = 15;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearEquipment() {
      bitField0_ &= ~0x00000080;
      equipment.clear();
      return this;
    }

    /**
     * <code>optional .DisplayEquipmentInfo equipment = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEquipment()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public DisplayEquipmentInfoOuterClass.DisplayEquipmentInfo getEquipment() {
      return equipment;
    }

    /**
     * <code>optional .DisplayEquipmentInfo equipment = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public DisplayEquipmentInfoOuterClass.DisplayEquipmentInfo getMutableEquipment() {
      bitField0_ |= 0x00000080;
      return equipment;
    }

    /**
     * <code>optional .DisplayEquipmentInfo equipment = 15;</code>
     * @param value the equipment to set
     * @return this
     */
    public DisplayAvatarDetailInfo setEquipment(
        final DisplayEquipmentInfoOuterClass.DisplayEquipmentInfo value) {
      bitField0_ |= 0x00000080;
      equipment.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 7;</code>
     * @return whether the skilltreeList field is set
     */
    public boolean hasSkilltreeList() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 7;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearSkilltreeList() {
      bitField0_ &= ~0x00000100;
      skilltreeList.clear();
      return this;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSkilltreeList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getSkilltreeList() {
      return skilltreeList;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getMutableSkilltreeList() {
      bitField0_ |= 0x00000100;
      return skilltreeList;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 7;</code>
     * @param value the skilltreeList to add
     * @return this
     */
    public DisplayAvatarDetailInfo addSkilltreeList(
        final AvatarSkillTreeOuterClass.AvatarSkillTree value) {
      bitField0_ |= 0x00000100;
      skilltreeList.add(value);
      return this;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 7;</code>
     * @param values the skilltreeList to add
     * @return this
     */
    public DisplayAvatarDetailInfo addAllSkilltreeList(
        final AvatarSkillTreeOuterClass.AvatarSkillTree... values) {
      bitField0_ |= 0x00000100;
      skilltreeList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .DisplayRelicInfo relic_list = 13;</code>
     * @return whether the relicList field is set
     */
    public boolean hasRelicList() {
      return (bitField0_ & 0x00000200) != 0;
    }

    /**
     * <code>repeated .DisplayRelicInfo relic_list = 13;</code>
     * @return this
     */
    public DisplayAvatarDetailInfo clearRelicList() {
      bitField0_ &= ~0x00000200;
      relicList.clear();
      return this;
    }

    /**
     * <code>repeated .DisplayRelicInfo relic_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRelicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<DisplayRelicInfoOuterClass.DisplayRelicInfo> getRelicList() {
      return relicList;
    }

    /**
     * <code>repeated .DisplayRelicInfo relic_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<DisplayRelicInfoOuterClass.DisplayRelicInfo> getMutableRelicList() {
      bitField0_ |= 0x00000200;
      return relicList;
    }

    /**
     * <code>repeated .DisplayRelicInfo relic_list = 13;</code>
     * @param value the relicList to add
     * @return this
     */
    public DisplayAvatarDetailInfo addRelicList(
        final DisplayRelicInfoOuterClass.DisplayRelicInfo value) {
      bitField0_ |= 0x00000200;
      relicList.add(value);
      return this;
    }

    /**
     * <code>repeated .DisplayRelicInfo relic_list = 13;</code>
     * @param values the relicList to add
     * @return this
     */
    public DisplayAvatarDetailInfo addAllRelicList(
        final DisplayRelicInfoOuterClass.DisplayRelicInfo... values) {
      bitField0_ |= 0x00000200;
      relicList.addAll(values);
      return this;
    }

    @Override
    public DisplayAvatarDetailInfo copyFrom(final DisplayAvatarDetailInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
        pos = other.pos;
        promotion = other.promotion;
        level = other.level;
        rank = other.rank;
        exp = other.exp;
        dressedSkinId = other.dressedSkinId;
        equipment.copyFrom(other.equipment);
        skilltreeList.copyFrom(other.skilltreeList);
        relicList.copyFrom(other.relicList);
      }
      return this;
    }

    @Override
    public DisplayAvatarDetailInfo mergeFrom(final DisplayAvatarDetailInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasPos()) {
        setPos(other.pos);
      }
      if (other.hasPromotion()) {
        setPromotion(other.promotion);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasDressedSkinId()) {
        setDressedSkinId(other.dressedSkinId);
      }
      if (other.hasEquipment()) {
        getMutableEquipment().mergeFrom(other.equipment);
      }
      if (other.hasSkilltreeList()) {
        getMutableSkilltreeList().addAll(other.skilltreeList);
      }
      if (other.hasRelicList()) {
        getMutableRelicList().addAll(other.relicList);
      }
      return this;
    }

    @Override
    public DisplayAvatarDetailInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      pos = 0;
      promotion = 0;
      level = 0;
      rank = 0;
      exp = 0;
      dressedSkinId = 0;
      equipment.clear();
      skilltreeList.clear();
      relicList.clear();
      return this;
    }

    @Override
    public DisplayAvatarDetailInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      equipment.clearQuick();
      skilltreeList.clearQuick();
      relicList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DisplayAvatarDetailInfo)) {
        return false;
      }
      DisplayAvatarDetailInfo other = (DisplayAvatarDetailInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasPos() || pos == other.pos)
        && (!hasPromotion() || promotion == other.promotion)
        && (!hasLevel() || level == other.level)
        && (!hasRank() || rank == other.rank)
        && (!hasExp() || exp == other.exp)
        && (!hasDressedSkinId() || dressedSkinId == other.dressedSkinId)
        && (!hasEquipment() || equipment.equals(other.equipment))
        && (!hasSkilltreeList() || skilltreeList.equals(other.skilltreeList))
        && (!hasRelicList() || relicList.equals(other.relicList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(pos);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(promotion);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(dressedSkinId);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(equipment);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < skilltreeList.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(skilltreeList.get(i));
        }
      }
      if ((bitField0_ & 0x00000200) != 0) {
        for (int i = 0; i < relicList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(relicList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(pos);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(promotion);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dressedSkinId);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(equipment);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * skilltreeList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(skilltreeList);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        size += (1 * relicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(relicList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DisplayAvatarDetailInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // pos
            pos = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // promotion
            promotion = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // dressedSkinId
            dressedSkinId = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // equipment
            input.readMessage(equipment);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // skilltreeList
            tag = input.readRepeatedMessage(skilltreeList, tag);
            bitField0_ |= 0x00000100;
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // relicList
            tag = input.readRepeatedMessage(relicList, tag);
            bitField0_ |= 0x00000200;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.pos, pos);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.promotion, promotion);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.dressedSkinId, dressedSkinId);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.equipment, equipment);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.skilltreeList, skilltreeList);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeRepeatedMessage(FieldNames.relicList, relicList);
      }
      output.endObject();
    }

    @Override
    public DisplayAvatarDetailInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 111188: {
            if (input.isAtField(FieldNames.pos)) {
              if (!input.trySkipNullValue()) {
                pos = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -799212381: {
            if (input.isAtField(FieldNames.promotion)) {
              if (!input.trySkipNullValue()) {
                promotion = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3492908: {
            if (input.isAtField(FieldNames.rank)) {
              if (!input.trySkipNullValue()) {
                rank = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100893: {
            if (input.isAtField(FieldNames.exp)) {
              if (!input.trySkipNullValue()) {
                exp = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -407000018:
          case 2012697844: {
            if (input.isAtField(FieldNames.dressedSkinId)) {
              if (!input.trySkipNullValue()) {
                dressedSkinId = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1076356494: {
            if (input.isAtField(FieldNames.equipment)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(equipment);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1549763245:
          case 815647086: {
            if (input.isAtField(FieldNames.skilltreeList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(skilltreeList);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 204814001:
          case 2071893482: {
            if (input.isAtField(FieldNames.relicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(relicList);
                bitField0_ |= 0x00000200;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public DisplayAvatarDetailInfo clone() {
      return new DisplayAvatarDetailInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DisplayAvatarDetailInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DisplayAvatarDetailInfo(), data).checkInitialized();
    }

    public static DisplayAvatarDetailInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayAvatarDetailInfo(), input).checkInitialized();
    }

    public static DisplayAvatarDetailInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayAvatarDetailInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating DisplayAvatarDetailInfo messages
     */
    public static MessageFactory<DisplayAvatarDetailInfo> getFactory() {
      return DisplayAvatarDetailInfoFactory.INSTANCE;
    }

    private enum DisplayAvatarDetailInfoFactory implements MessageFactory<DisplayAvatarDetailInfo> {
      INSTANCE;

      @Override
      public DisplayAvatarDetailInfo create() {
        return DisplayAvatarDetailInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName pos = FieldName.forField("pos");

      static final FieldName promotion = FieldName.forField("promotion");

      static final FieldName level = FieldName.forField("level");

      static final FieldName rank = FieldName.forField("rank");

      static final FieldName exp = FieldName.forField("exp");

      static final FieldName dressedSkinId = FieldName.forField("dressedSkinId", "dressed_skin_id");

      static final FieldName equipment = FieldName.forField("equipment");

      static final FieldName skilltreeList = FieldName.forField("skilltreeList", "skilltree_list");

      static final FieldName relicList = FieldName.forField("relicList", "relic_list");
    }
  }
}
