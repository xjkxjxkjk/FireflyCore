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
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class MultiPathAvatarTypeInfoOuterClass {
  /**
   * <pre>
   *  PDLCDMEPDDJ
   * </pre>
   *
   * Protobuf type {@code MultiPathAvatarTypeInfo}
   */
  public static final class MultiPathAvatarTypeInfo extends ProtoMessage<MultiPathAvatarTypeInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * ? 9
     * </pre>
     *
     * <code>optional uint32 rank = 12;</code>
     */
    private int rank;

    /**
     * <pre>
     * uint32 IJHEIBNJOAO = 9;
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 11;</code>
     */
    private int avatarId;

    /**
     * <pre>
     * repeated AvatarSkillTree PODGAIBLNCM = 14;
     * uint32 GJLJMAGJDNK = 12;
     * </pre>
     *
     * <code>repeated uint32 IBLJIJAPFFC = 15;</code>
     */
    private final RepeatedInt iBLJIJAPFFC = RepeatedInt.newEmptyInstance();

    /**
     * <pre>
     * ? 14
     * </pre>
     *
     * <code>repeated .AvatarSkillTree skill_tree_list = 5;</code>
     */
    private final RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> skillTreeList = RepeatedMessage.newEmptyInstance(AvatarSkillTreeOuterClass.AvatarSkillTree.getFactory());

    /**
     * <pre>
     * repeated AvatarSkillTree APEMKCLHBML = 5;
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 13;</code>
     */
    private final RepeatedMessage<EquipRelicOuterClass.EquipRelic> equipRelicList = RepeatedMessage.newEmptyInstance(EquipRelicOuterClass.EquipRelic.getFactory());

    private MultiPathAvatarTypeInfo() {
    }

    /**
     * <pre>
     *  PDLCDMEPDDJ
     * </pre>
     *
     * @return a new empty instance of {@code MultiPathAvatarTypeInfo}
     */
    public static MultiPathAvatarTypeInfo newInstance() {
      return new MultiPathAvatarTypeInfo();
    }

    /**
     * <pre>
     * ? 9
     * </pre>
     *
     * <code>optional uint32 rank = 12;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * ? 9
     * </pre>
     *
     * <code>optional uint32 rank = 12;</code>
     * @return this
     */
    public MultiPathAvatarTypeInfo clearRank() {
      bitField0_ &= ~0x00000001;
      rank = 0;
      return this;
    }

    /**
     * <pre>
     * ? 9
     * </pre>
     *
     * <code>optional uint32 rank = 12;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <pre>
     * ? 9
     * </pre>
     *
     * <code>optional uint32 rank = 12;</code>
     * @param value the rank to set
     * @return this
     */
    public MultiPathAvatarTypeInfo setRank(final int value) {
      bitField0_ |= 0x00000001;
      rank = value;
      return this;
    }

    /**
     * <pre>
     * uint32 IJHEIBNJOAO = 9;
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 11;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * uint32 IJHEIBNJOAO = 9;
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 11;</code>
     * @return this
     */
    public MultiPathAvatarTypeInfo clearAvatarId() {
      bitField0_ &= ~0x00000002;
      avatarId = 0;
      return this;
    }

    /**
     * <pre>
     * uint32 IJHEIBNJOAO = 9;
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 11;</code>
     * @return the avatarId
     */
    public MultiPathAvatarTypeOuterClass.MultiPathAvatarType getAvatarId() {
      return MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(avatarId);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link MultiPathAvatarTypeInfo#getAvatarId()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getAvatarIdValue() {
      return avatarId;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link MultiPathAvatarTypeOuterClass.MultiPathAvatarType}. Setting an invalid value
     * can cause {@link MultiPathAvatarTypeInfo#getAvatarId()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public MultiPathAvatarTypeInfo setAvatarIdValue(final int value) {
      bitField0_ |= 0x00000002;
      avatarId = value;
      return this;
    }

    /**
     * <pre>
     * uint32 IJHEIBNJOAO = 9;
     * </pre>
     *
     * <code>optional .MultiPathAvatarType avatar_id = 11;</code>
     * @param value the avatarId to set
     * @return this
     */
    public MultiPathAvatarTypeInfo setAvatarId(
        final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value) {
      bitField0_ |= 0x00000002;
      avatarId = value.getNumber();
      return this;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree PODGAIBLNCM = 14;
     * uint32 GJLJMAGJDNK = 12;
     * </pre>
     *
     * <code>repeated uint32 IBLJIJAPFFC = 15;</code>
     * @return whether the iBLJIJAPFFC field is set
     */
    public boolean hasIBLJIJAPFFC() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree PODGAIBLNCM = 14;
     * uint32 GJLJMAGJDNK = 12;
     * </pre>
     *
     * <code>repeated uint32 IBLJIJAPFFC = 15;</code>
     * @return this
     */
    public MultiPathAvatarTypeInfo clearIBLJIJAPFFC() {
      bitField0_ &= ~0x00000004;
      iBLJIJAPFFC.clear();
      return this;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree PODGAIBLNCM = 14;
     * uint32 GJLJMAGJDNK = 12;
     * </pre>
     *
     * <code>repeated uint32 IBLJIJAPFFC = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableIBLJIJAPFFC()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getIBLJIJAPFFC() {
      return iBLJIJAPFFC;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree PODGAIBLNCM = 14;
     * uint32 GJLJMAGJDNK = 12;
     * </pre>
     *
     * <code>repeated uint32 IBLJIJAPFFC = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableIBLJIJAPFFC() {
      bitField0_ |= 0x00000004;
      return iBLJIJAPFFC;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree PODGAIBLNCM = 14;
     * uint32 GJLJMAGJDNK = 12;
     * </pre>
     *
     * <code>repeated uint32 IBLJIJAPFFC = 15;</code>
     * @param value the iBLJIJAPFFC to add
     * @return this
     */
    public MultiPathAvatarTypeInfo addIBLJIJAPFFC(final int value) {
      bitField0_ |= 0x00000004;
      iBLJIJAPFFC.add(value);
      return this;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree PODGAIBLNCM = 14;
     * uint32 GJLJMAGJDNK = 12;
     * </pre>
     *
     * <code>repeated uint32 IBLJIJAPFFC = 15;</code>
     * @param values the iBLJIJAPFFC to add
     * @return this
     */
    public MultiPathAvatarTypeInfo addAllIBLJIJAPFFC(final int... values) {
      bitField0_ |= 0x00000004;
      iBLJIJAPFFC.addAll(values);
      return this;
    }

    /**
     * <pre>
     * ? 14
     * </pre>
     *
     * <code>repeated .AvatarSkillTree skill_tree_list = 5;</code>
     * @return whether the skillTreeList field is set
     */
    public boolean hasSkillTreeList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * ? 14
     * </pre>
     *
     * <code>repeated .AvatarSkillTree skill_tree_list = 5;</code>
     * @return this
     */
    public MultiPathAvatarTypeInfo clearSkillTreeList() {
      bitField0_ &= ~0x00000008;
      skillTreeList.clear();
      return this;
    }

    /**
     * <pre>
     * ? 14
     * </pre>
     *
     * <code>repeated .AvatarSkillTree skill_tree_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSkillTreeList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getSkillTreeList() {
      return skillTreeList;
    }

    /**
     * <pre>
     * ? 14
     * </pre>
     *
     * <code>repeated .AvatarSkillTree skill_tree_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getMutableSkillTreeList() {
      bitField0_ |= 0x00000008;
      return skillTreeList;
    }

    /**
     * <pre>
     * ? 14
     * </pre>
     *
     * <code>repeated .AvatarSkillTree skill_tree_list = 5;</code>
     * @param value the skillTreeList to add
     * @return this
     */
    public MultiPathAvatarTypeInfo addSkillTreeList(
        final AvatarSkillTreeOuterClass.AvatarSkillTree value) {
      bitField0_ |= 0x00000008;
      skillTreeList.add(value);
      return this;
    }

    /**
     * <pre>
     * ? 14
     * </pre>
     *
     * <code>repeated .AvatarSkillTree skill_tree_list = 5;</code>
     * @param values the skillTreeList to add
     * @return this
     */
    public MultiPathAvatarTypeInfo addAllSkillTreeList(
        final AvatarSkillTreeOuterClass.AvatarSkillTree... values) {
      bitField0_ |= 0x00000008;
      skillTreeList.addAll(values);
      return this;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree APEMKCLHBML = 5;
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 13;</code>
     * @return whether the equipRelicList field is set
     */
    public boolean hasEquipRelicList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree APEMKCLHBML = 5;
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 13;</code>
     * @return this
     */
    public MultiPathAvatarTypeInfo clearEquipRelicList() {
      bitField0_ &= ~0x00000010;
      equipRelicList.clear();
      return this;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree APEMKCLHBML = 5;
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEquipRelicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<EquipRelicOuterClass.EquipRelic> getEquipRelicList() {
      return equipRelicList;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree APEMKCLHBML = 5;
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<EquipRelicOuterClass.EquipRelic> getMutableEquipRelicList() {
      bitField0_ |= 0x00000010;
      return equipRelicList;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree APEMKCLHBML = 5;
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 13;</code>
     * @param value the equipRelicList to add
     * @return this
     */
    public MultiPathAvatarTypeInfo addEquipRelicList(final EquipRelicOuterClass.EquipRelic value) {
      bitField0_ |= 0x00000010;
      equipRelicList.add(value);
      return this;
    }

    /**
     * <pre>
     * repeated AvatarSkillTree APEMKCLHBML = 5;
     * </pre>
     *
     * <code>repeated .EquipRelic equip_relic_list = 13;</code>
     * @param values the equipRelicList to add
     * @return this
     */
    public MultiPathAvatarTypeInfo addAllEquipRelicList(
        final EquipRelicOuterClass.EquipRelic... values) {
      bitField0_ |= 0x00000010;
      equipRelicList.addAll(values);
      return this;
    }

    @Override
    public MultiPathAvatarTypeInfo copyFrom(final MultiPathAvatarTypeInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rank = other.rank;
        avatarId = other.avatarId;
        iBLJIJAPFFC.copyFrom(other.iBLJIJAPFFC);
        skillTreeList.copyFrom(other.skillTreeList);
        equipRelicList.copyFrom(other.equipRelicList);
      }
      return this;
    }

    @Override
    public MultiPathAvatarTypeInfo mergeFrom(final MultiPathAvatarTypeInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasAvatarId()) {
        setAvatarIdValue(other.avatarId);
      }
      if (other.hasIBLJIJAPFFC()) {
        getMutableIBLJIJAPFFC().addAll(other.iBLJIJAPFFC);
      }
      if (other.hasSkillTreeList()) {
        getMutableSkillTreeList().addAll(other.skillTreeList);
      }
      if (other.hasEquipRelicList()) {
        getMutableEquipRelicList().addAll(other.equipRelicList);
      }
      return this;
    }

    @Override
    public MultiPathAvatarTypeInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rank = 0;
      avatarId = 0;
      iBLJIJAPFFC.clear();
      skillTreeList.clear();
      equipRelicList.clear();
      return this;
    }

    @Override
    public MultiPathAvatarTypeInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      iBLJIJAPFFC.clear();
      skillTreeList.clearQuick();
      equipRelicList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof MultiPathAvatarTypeInfo)) {
        return false;
      }
      MultiPathAvatarTypeInfo other = (MultiPathAvatarTypeInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRank() || rank == other.rank)
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasIBLJIJAPFFC() || iBLJIJAPFFC.equals(other.iBLJIJAPFFC))
        && (!hasSkillTreeList() || skillTreeList.equals(other.skillTreeList))
        && (!hasEquipRelicList() || equipRelicList.equals(other.equipRelicList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeEnumNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < iBLJIJAPFFC.length(); i++) {
          output.writeRawByte((byte) 120);
          output.writeUInt32NoTag(iBLJIJAPFFC.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < skillTreeList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(skillTreeList.get(i));
        }
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < equipRelicList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(equipRelicList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * iBLJIJAPFFC.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(iBLJIJAPFFC);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * skillTreeList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(skillTreeList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * equipRelicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(equipRelicList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MultiPathAvatarTypeInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // avatarId
            final int value = input.readInt32();
            if (MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value) != null) {
              avatarId = value;
              bitField0_ |= 0x00000002;
            }
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // iBLJIJAPFFC [packed=true]
            input.readPackedUInt32(iBLJIJAPFFC, tag);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // skillTreeList
            tag = input.readRepeatedMessage(skillTreeList, tag);
            bitField0_ |= 0x00000008;
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // equipRelicList
            tag = input.readRepeatedMessage(equipRelicList, tag);
            bitField0_ |= 0x00000010;
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
          case 120: {
            // iBLJIJAPFFC [packed=false]
            tag = input.readRepeatedUInt32(iBLJIJAPFFC, tag);
            bitField0_ |= 0x00000004;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.avatarId, avatarId, MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.iBLJIJAPFFC, iBLJIJAPFFC);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.skillTreeList, skillTreeList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.equipRelicList, equipRelicList);
      }
      output.endObject();
    }

    @Override
    public MultiPathAvatarTypeInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3492908: {
            if (input.isAtField(FieldNames.rank)) {
              if (!input.trySkipNullValue()) {
                rank = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value = input.readEnum(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
                if (value != null) {
                  avatarId = value.getNumber();
                  bitField0_ |= 0x00000002;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 322238524: {
            if (input.isAtField(FieldNames.iBLJIJAPFFC)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(iBLJIJAPFFC);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1614407373:
          case 1368677425: {
            if (input.isAtField(FieldNames.skillTreeList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(skillTreeList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1578968161:
          case -795441831: {
            if (input.isAtField(FieldNames.equipRelicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(equipRelicList);
                bitField0_ |= 0x00000010;
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
    public MultiPathAvatarTypeInfo clone() {
      return new MultiPathAvatarTypeInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MultiPathAvatarTypeInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MultiPathAvatarTypeInfo(), data).checkInitialized();
    }

    public static MultiPathAvatarTypeInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MultiPathAvatarTypeInfo(), input).checkInitialized();
    }

    public static MultiPathAvatarTypeInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MultiPathAvatarTypeInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating MultiPathAvatarTypeInfo messages
     */
    public static MessageFactory<MultiPathAvatarTypeInfo> getFactory() {
      return MultiPathAvatarTypeInfoFactory.INSTANCE;
    }

    private enum MultiPathAvatarTypeInfoFactory implements MessageFactory<MultiPathAvatarTypeInfo> {
      INSTANCE;

      @Override
      public MultiPathAvatarTypeInfo create() {
        return MultiPathAvatarTypeInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rank = FieldName.forField("rank");

      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName iBLJIJAPFFC = FieldName.forField("IBLJIJAPFFC");

      static final FieldName skillTreeList = FieldName.forField("skillTreeList", "skill_tree_list");

      static final FieldName equipRelicList = FieldName.forField("equipRelicList", "equip_relic_list");
    }
  }
}
