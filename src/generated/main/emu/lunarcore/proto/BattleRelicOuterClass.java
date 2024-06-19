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

public final class BattleRelicOuterClass {
  /**
   * Protobuf type {@code BattleRelic}
   */
  public static final class BattleRelic extends ProtoMessage<BattleRelic> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 id = 1;</code>
     */
    private int id;

    /**
     * <pre>
     *  uint32 igljlnabhnf = 3;
     *  uint32 dkdmaeajipo = 5;
     *  uint32 iocdidhahhj = 11;
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     */
    private int level;

    /**
     * <pre>
     *  MNIFHJFEEPA
     * </pre>
     *
     * <code>optional uint32 main_affix_id = 3;</code>
     */
    private int mainAffixId;

    /**
     * <pre>
     *  CPMIOJJCNHH
     * </pre>
     *
     * <code>optional uint32 unique_id = 5;</code>
     */
    private int uniqueId;

    /**
     * <pre>
     *  PMOPKFLFGKO
     * </pre>
     *
     * <code>optional uint32 set_id = 6;</code>
     */
    private int setId;

    /**
     * <pre>
     *  GNPPAEIDJIO
     * </pre>
     *
     * <code>optional uint32 type = 7;</code>
     */
    private int type;

    /**
     * <pre>
     *  NBJEIMOAAOK
     * </pre>
     *
     * <code>optional uint32 rarity = 8;</code>
     */
    private int rarity;

    /**
     * <code>repeated .RelicAffix sub_affix_list = 4;</code>
     */
    private final RepeatedMessage<RelicAffixOuterClass.RelicAffix> subAffixList = RepeatedMessage.newEmptyInstance(RelicAffixOuterClass.RelicAffix.getFactory());

    private BattleRelic() {
    }

    /**
     * @return a new empty instance of {@code BattleRelic}
     */
    public static BattleRelic newInstance() {
      return new BattleRelic();
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @return this
     */
    public BattleRelic clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @param value the id to set
     * @return this
     */
    public BattleRelic setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    /**
     * <pre>
     *  uint32 igljlnabhnf = 3;
     *  uint32 dkdmaeajipo = 5;
     *  uint32 iocdidhahhj = 11;
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  uint32 igljlnabhnf = 3;
     *  uint32 dkdmaeajipo = 5;
     *  uint32 iocdidhahhj = 11;
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @return this
     */
    public BattleRelic clearLevel() {
      bitField0_ &= ~0x00000002;
      level = 0;
      return this;
    }

    /**
     * <pre>
     *  uint32 igljlnabhnf = 3;
     *  uint32 dkdmaeajipo = 5;
     *  uint32 iocdidhahhj = 11;
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <pre>
     *  uint32 igljlnabhnf = 3;
     *  uint32 dkdmaeajipo = 5;
     *  uint32 iocdidhahhj = 11;
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @param value the level to set
     * @return this
     */
    public BattleRelic setLevel(final int value) {
      bitField0_ |= 0x00000002;
      level = value;
      return this;
    }

    /**
     * <pre>
     *  MNIFHJFEEPA
     * </pre>
     *
     * <code>optional uint32 main_affix_id = 3;</code>
     * @return whether the mainAffixId field is set
     */
    public boolean hasMainAffixId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  MNIFHJFEEPA
     * </pre>
     *
     * <code>optional uint32 main_affix_id = 3;</code>
     * @return this
     */
    public BattleRelic clearMainAffixId() {
      bitField0_ &= ~0x00000004;
      mainAffixId = 0;
      return this;
    }

    /**
     * <pre>
     *  MNIFHJFEEPA
     * </pre>
     *
     * <code>optional uint32 main_affix_id = 3;</code>
     * @return the mainAffixId
     */
    public int getMainAffixId() {
      return mainAffixId;
    }

    /**
     * <pre>
     *  MNIFHJFEEPA
     * </pre>
     *
     * <code>optional uint32 main_affix_id = 3;</code>
     * @param value the mainAffixId to set
     * @return this
     */
    public BattleRelic setMainAffixId(final int value) {
      bitField0_ |= 0x00000004;
      mainAffixId = value;
      return this;
    }

    /**
     * <pre>
     *  CPMIOJJCNHH
     * </pre>
     *
     * <code>optional uint32 unique_id = 5;</code>
     * @return whether the uniqueId field is set
     */
    public boolean hasUniqueId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  CPMIOJJCNHH
     * </pre>
     *
     * <code>optional uint32 unique_id = 5;</code>
     * @return this
     */
    public BattleRelic clearUniqueId() {
      bitField0_ &= ~0x00000008;
      uniqueId = 0;
      return this;
    }

    /**
     * <pre>
     *  CPMIOJJCNHH
     * </pre>
     *
     * <code>optional uint32 unique_id = 5;</code>
     * @return the uniqueId
     */
    public int getUniqueId() {
      return uniqueId;
    }

    /**
     * <pre>
     *  CPMIOJJCNHH
     * </pre>
     *
     * <code>optional uint32 unique_id = 5;</code>
     * @param value the uniqueId to set
     * @return this
     */
    public BattleRelic setUniqueId(final int value) {
      bitField0_ |= 0x00000008;
      uniqueId = value;
      return this;
    }

    /**
     * <pre>
     *  PMOPKFLFGKO
     * </pre>
     *
     * <code>optional uint32 set_id = 6;</code>
     * @return whether the setId field is set
     */
    public boolean hasSetId() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     *  PMOPKFLFGKO
     * </pre>
     *
     * <code>optional uint32 set_id = 6;</code>
     * @return this
     */
    public BattleRelic clearSetId() {
      bitField0_ &= ~0x00000010;
      setId = 0;
      return this;
    }

    /**
     * <pre>
     *  PMOPKFLFGKO
     * </pre>
     *
     * <code>optional uint32 set_id = 6;</code>
     * @return the setId
     */
    public int getSetId() {
      return setId;
    }

    /**
     * <pre>
     *  PMOPKFLFGKO
     * </pre>
     *
     * <code>optional uint32 set_id = 6;</code>
     * @param value the setId to set
     * @return this
     */
    public BattleRelic setSetId(final int value) {
      bitField0_ |= 0x00000010;
      setId = value;
      return this;
    }

    /**
     * <pre>
     *  GNPPAEIDJIO
     * </pre>
     *
     * <code>optional uint32 type = 7;</code>
     * @return whether the type field is set
     */
    public boolean hasType() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     *  GNPPAEIDJIO
     * </pre>
     *
     * <code>optional uint32 type = 7;</code>
     * @return this
     */
    public BattleRelic clearType() {
      bitField0_ &= ~0x00000020;
      type = 0;
      return this;
    }

    /**
     * <pre>
     *  GNPPAEIDJIO
     * </pre>
     *
     * <code>optional uint32 type = 7;</code>
     * @return the type
     */
    public int getType() {
      return type;
    }

    /**
     * <pre>
     *  GNPPAEIDJIO
     * </pre>
     *
     * <code>optional uint32 type = 7;</code>
     * @param value the type to set
     * @return this
     */
    public BattleRelic setType(final int value) {
      bitField0_ |= 0x00000020;
      type = value;
      return this;
    }

    /**
     * <pre>
     *  NBJEIMOAAOK
     * </pre>
     *
     * <code>optional uint32 rarity = 8;</code>
     * @return whether the rarity field is set
     */
    public boolean hasRarity() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     *  NBJEIMOAAOK
     * </pre>
     *
     * <code>optional uint32 rarity = 8;</code>
     * @return this
     */
    public BattleRelic clearRarity() {
      bitField0_ &= ~0x00000040;
      rarity = 0;
      return this;
    }

    /**
     * <pre>
     *  NBJEIMOAAOK
     * </pre>
     *
     * <code>optional uint32 rarity = 8;</code>
     * @return the rarity
     */
    public int getRarity() {
      return rarity;
    }

    /**
     * <pre>
     *  NBJEIMOAAOK
     * </pre>
     *
     * <code>optional uint32 rarity = 8;</code>
     * @param value the rarity to set
     * @return this
     */
    public BattleRelic setRarity(final int value) {
      bitField0_ |= 0x00000040;
      rarity = value;
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 4;</code>
     * @return whether the subAffixList field is set
     */
    public boolean hasSubAffixList() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 4;</code>
     * @return this
     */
    public BattleRelic clearSubAffixList() {
      bitField0_ &= ~0x00000080;
      subAffixList.clear();
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSubAffixList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getSubAffixList() {
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getMutableSubAffixList() {
      bitField0_ |= 0x00000080;
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 4;</code>
     * @param value the subAffixList to add
     * @return this
     */
    public BattleRelic addSubAffixList(final RelicAffixOuterClass.RelicAffix value) {
      bitField0_ |= 0x00000080;
      subAffixList.add(value);
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 4;</code>
     * @param values the subAffixList to add
     * @return this
     */
    public BattleRelic addAllSubAffixList(final RelicAffixOuterClass.RelicAffix... values) {
      bitField0_ |= 0x00000080;
      subAffixList.addAll(values);
      return this;
    }

    @Override
    public BattleRelic copyFrom(final BattleRelic other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
        level = other.level;
        mainAffixId = other.mainAffixId;
        uniqueId = other.uniqueId;
        setId = other.setId;
        type = other.type;
        rarity = other.rarity;
        subAffixList.copyFrom(other.subAffixList);
      }
      return this;
    }

    @Override
    public BattleRelic mergeFrom(final BattleRelic other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasMainAffixId()) {
        setMainAffixId(other.mainAffixId);
      }
      if (other.hasUniqueId()) {
        setUniqueId(other.uniqueId);
      }
      if (other.hasSetId()) {
        setSetId(other.setId);
      }
      if (other.hasType()) {
        setType(other.type);
      }
      if (other.hasRarity()) {
        setRarity(other.rarity);
      }
      if (other.hasSubAffixList()) {
        getMutableSubAffixList().addAll(other.subAffixList);
      }
      return this;
    }

    @Override
    public BattleRelic clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      level = 0;
      mainAffixId = 0;
      uniqueId = 0;
      setId = 0;
      type = 0;
      rarity = 0;
      subAffixList.clear();
      return this;
    }

    @Override
    public BattleRelic clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      subAffixList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof BattleRelic)) {
        return false;
      }
      BattleRelic other = (BattleRelic) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id)
        && (!hasLevel() || level == other.level)
        && (!hasMainAffixId() || mainAffixId == other.mainAffixId)
        && (!hasUniqueId() || uniqueId == other.uniqueId)
        && (!hasSetId() || setId == other.setId)
        && (!hasType() || type == other.type)
        && (!hasRarity() || rarity == other.rarity)
        && (!hasSubAffixList() || subAffixList.equals(other.subAffixList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(setId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(type);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(rarity);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < subAffixList.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(subAffixList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(setId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(type);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rarity);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * subAffixList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(subAffixList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BattleRelic mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // mainAffixId
            mainAffixId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // uniqueId
            uniqueId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // setId
            setId = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // type
            type = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // rarity
            rarity = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // subAffixList
            tag = input.readRepeatedMessage(subAffixList, tag);
            bitField0_ |= 0x00000080;
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
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.mainAffixId, mainAffixId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.uniqueId, uniqueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.setId, setId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.type, type);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.rarity, rarity);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedMessage(FieldNames.subAffixList, subAffixList);
      }
      output.endObject();
    }

    @Override
    public BattleRelic mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000001;
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
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1973876974:
          case -1426712144: {
            if (input.isAtField(FieldNames.mainAffixId)) {
              if (!input.trySkipNullValue()) {
                mainAffixId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -294460212:
          case -538310583: {
            if (input.isAtField(FieldNames.uniqueId)) {
              if (!input.trySkipNullValue()) {
                uniqueId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109327645:
          case -905788904: {
            if (input.isAtField(FieldNames.setId)) {
              if (!input.trySkipNullValue()) {
                setId = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3575610: {
            if (input.isAtField(FieldNames.type)) {
              if (!input.trySkipNullValue()) {
                type = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -938161749: {
            if (input.isAtField(FieldNames.rarity)) {
              if (!input.trySkipNullValue()) {
                rarity = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -600836050:
          case 919890188: {
            if (input.isAtField(FieldNames.subAffixList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(subAffixList);
                bitField0_ |= 0x00000080;
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
    public BattleRelic clone() {
      return new BattleRelic().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BattleRelic parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BattleRelic(), data).checkInitialized();
    }

    public static BattleRelic parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleRelic(), input).checkInitialized();
    }

    public static BattleRelic parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleRelic(), input).checkInitialized();
    }

    /**
     * @return factory for creating BattleRelic messages
     */
    public static MessageFactory<BattleRelic> getFactory() {
      return BattleRelicFactory.INSTANCE;
    }

    private enum BattleRelicFactory implements MessageFactory<BattleRelic> {
      INSTANCE;

      @Override
      public BattleRelic create() {
        return BattleRelic.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("id");

      static final FieldName level = FieldName.forField("level");

      static final FieldName mainAffixId = FieldName.forField("mainAffixId", "main_affix_id");

      static final FieldName uniqueId = FieldName.forField("uniqueId", "unique_id");

      static final FieldName setId = FieldName.forField("setId", "set_id");

      static final FieldName type = FieldName.forField("type");

      static final FieldName rarity = FieldName.forField("rarity");

      static final FieldName subAffixList = FieldName.forField("subAffixList", "sub_affix_list");
    }
  }
}
