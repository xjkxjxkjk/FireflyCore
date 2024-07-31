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

public final class LineupAvatarOuterClass {
  /**
   * Protobuf type {@code LineupAvatar}
   */
  public static final class LineupAvatar extends ProtoMessage<LineupAvatar> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 slot_type = 5;</code>
     */
    private int slotType;

    /**
     * <code>optional uint32 hp = 6;</code>
     */
    private int hp;

    /**
     * <code>optional uint32 id = 8;</code>
     */
    private int id;

    /**
     * <code>optional uint32 satiety = 15;</code>
     */
    private int satiety;

    /**
     * <code>optional .AvatarType avatar_type = 1;</code>
     */
    private int avatarType;

    /**
     * <code>optional .SpBarInfo sp_bar = 14;</code>
     */
    private final SpBarInfoOuterClass.SpBarInfo spBar = SpBarInfoOuterClass.SpBarInfo.newInstance();

    private LineupAvatar() {
    }

    /**
     * @return a new empty instance of {@code LineupAvatar}
     */
    public static LineupAvatar newInstance() {
      return new LineupAvatar();
    }

    /**
     * <code>optional uint32 slot_type = 5;</code>
     * @return whether the slotType field is set
     */
    public boolean hasSlotType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 slot_type = 5;</code>
     * @return this
     */
    public LineupAvatar clearSlotType() {
      bitField0_ &= ~0x00000001;
      slotType = 0;
      return this;
    }

    /**
     * <code>optional uint32 slot_type = 5;</code>
     * @return the slotType
     */
    public int getSlotType() {
      return slotType;
    }

    /**
     * <code>optional uint32 slot_type = 5;</code>
     * @param value the slotType to set
     * @return this
     */
    public LineupAvatar setSlotType(final int value) {
      bitField0_ |= 0x00000001;
      slotType = value;
      return this;
    }

    /**
     * <code>optional uint32 hp = 6;</code>
     * @return whether the hp field is set
     */
    public boolean hasHp() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 hp = 6;</code>
     * @return this
     */
    public LineupAvatar clearHp() {
      bitField0_ &= ~0x00000002;
      hp = 0;
      return this;
    }

    /**
     * <code>optional uint32 hp = 6;</code>
     * @return the hp
     */
    public int getHp() {
      return hp;
    }

    /**
     * <code>optional uint32 hp = 6;</code>
     * @param value the hp to set
     * @return this
     */
    public LineupAvatar setHp(final int value) {
      bitField0_ |= 0x00000002;
      hp = value;
      return this;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return this
     */
    public LineupAvatar clearId() {
      bitField0_ &= ~0x00000004;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @param value the id to set
     * @return this
     */
    public LineupAvatar setId(final int value) {
      bitField0_ |= 0x00000004;
      id = value;
      return this;
    }

    /**
     * <code>optional uint32 satiety = 15;</code>
     * @return whether the satiety field is set
     */
    public boolean hasSatiety() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 satiety = 15;</code>
     * @return this
     */
    public LineupAvatar clearSatiety() {
      bitField0_ &= ~0x00000008;
      satiety = 0;
      return this;
    }

    /**
     * <code>optional uint32 satiety = 15;</code>
     * @return the satiety
     */
    public int getSatiety() {
      return satiety;
    }

    /**
     * <code>optional uint32 satiety = 15;</code>
     * @param value the satiety to set
     * @return this
     */
    public LineupAvatar setSatiety(final int value) {
      bitField0_ |= 0x00000008;
      satiety = value;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 1;</code>
     * @return whether the avatarType field is set
     */
    public boolean hasAvatarType() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .AvatarType avatar_type = 1;</code>
     * @return this
     */
    public LineupAvatar clearAvatarType() {
      bitField0_ &= ~0x00000010;
      avatarType = 0;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 1;</code>
     * @return the avatarType
     */
    public AvatarTypeOuterClass.AvatarType getAvatarType() {
      return AvatarTypeOuterClass.AvatarType.forNumber(avatarType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link LineupAvatar#getAvatarType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getAvatarTypeValue() {
      return avatarType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link AvatarTypeOuterClass.AvatarType}. Setting an invalid value
     * can cause {@link LineupAvatar#getAvatarType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public LineupAvatar setAvatarTypeValue(final int value) {
      bitField0_ |= 0x00000010;
      avatarType = value;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 1;</code>
     * @param value the avatarType to set
     * @return this
     */
    public LineupAvatar setAvatarType(final AvatarTypeOuterClass.AvatarType value) {
      bitField0_ |= 0x00000010;
      avatarType = value.getNumber();
      return this;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 14;</code>
     * @return whether the spBar field is set
     */
    public boolean hasSpBar() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 14;</code>
     * @return this
     */
    public LineupAvatar clearSpBar() {
      bitField0_ &= ~0x00000020;
      spBar.clear();
      return this;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSpBar()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SpBarInfoOuterClass.SpBarInfo getSpBar() {
      return spBar;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SpBarInfoOuterClass.SpBarInfo getMutableSpBar() {
      bitField0_ |= 0x00000020;
      return spBar;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 14;</code>
     * @param value the spBar to set
     * @return this
     */
    public LineupAvatar setSpBar(final SpBarInfoOuterClass.SpBarInfo value) {
      bitField0_ |= 0x00000020;
      spBar.copyFrom(value);
      return this;
    }

    @Override
    public LineupAvatar copyFrom(final LineupAvatar other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        slotType = other.slotType;
        hp = other.hp;
        id = other.id;
        satiety = other.satiety;
        avatarType = other.avatarType;
        spBar.copyFrom(other.spBar);
      }
      return this;
    }

    @Override
    public LineupAvatar mergeFrom(final LineupAvatar other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSlotType()) {
        setSlotType(other.slotType);
      }
      if (other.hasHp()) {
        setHp(other.hp);
      }
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasSatiety()) {
        setSatiety(other.satiety);
      }
      if (other.hasAvatarType()) {
        setAvatarTypeValue(other.avatarType);
      }
      if (other.hasSpBar()) {
        getMutableSpBar().mergeFrom(other.spBar);
      }
      return this;
    }

    @Override
    public LineupAvatar clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      slotType = 0;
      hp = 0;
      id = 0;
      satiety = 0;
      avatarType = 0;
      spBar.clear();
      return this;
    }

    @Override
    public LineupAvatar clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      spBar.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LineupAvatar)) {
        return false;
      }
      LineupAvatar other = (LineupAvatar) o;
      return bitField0_ == other.bitField0_
        && (!hasSlotType() || slotType == other.slotType)
        && (!hasHp() || hp == other.hp)
        && (!hasId() || id == other.id)
        && (!hasSatiety() || satiety == other.satiety)
        && (!hasAvatarType() || avatarType == other.avatarType)
        && (!hasSpBar() || spBar.equals(other.spBar));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(slotType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(hp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(satiety);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 8);
        output.writeEnumNoTag(avatarType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(spBar);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(slotType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(hp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(satiety);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(avatarType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(spBar);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LineupAvatar mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // slotType
            slotType = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // hp
            hp = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // satiety
            satiety = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // avatarType
            final int value = input.readInt32();
            if (AvatarTypeOuterClass.AvatarType.forNumber(value) != null) {
              avatarType = value;
              bitField0_ |= 0x00000010;
            }
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // spBar
            input.readMessage(spBar);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
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
        output.writeUInt32(FieldNames.slotType, slotType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.hp, hp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.satiety, satiety);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeEnum(FieldNames.avatarType, avatarType, AvatarTypeOuterClass.AvatarType.converter());
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.spBar, spBar);
      }
      output.endObject();
    }

    @Override
    public LineupAvatar mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1086538152:
          case 687074523: {
            if (input.isAtField(FieldNames.slotType)) {
              if (!input.trySkipNullValue()) {
                slotType = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3336: {
            if (input.isAtField(FieldNames.hp)) {
              if (!input.trySkipNullValue()) {
                hp = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1871093127: {
            if (input.isAtField(FieldNames.satiety)) {
              if (!input.trySkipNullValue()) {
                satiety = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -403148749:
          case 397309536: {
            if (input.isAtField(FieldNames.avatarType)) {
              if (!input.trySkipNullValue()) {
                final AvatarTypeOuterClass.AvatarType value = input.readEnum(AvatarTypeOuterClass.AvatarType.converter());
                if (value != null) {
                  avatarType = value.getNumber();
                  bitField0_ |= 0x00000010;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109608054:
          case -896253135: {
            if (input.isAtField(FieldNames.spBar)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(spBar);
                bitField0_ |= 0x00000020;
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
    public LineupAvatar clone() {
      return new LineupAvatar().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LineupAvatar parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LineupAvatar(), data).checkInitialized();
    }

    public static LineupAvatar parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupAvatar(), input).checkInitialized();
    }

    public static LineupAvatar parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupAvatar(), input).checkInitialized();
    }

    /**
     * @return factory for creating LineupAvatar messages
     */
    public static MessageFactory<LineupAvatar> getFactory() {
      return LineupAvatarFactory.INSTANCE;
    }

    private enum LineupAvatarFactory implements MessageFactory<LineupAvatar> {
      INSTANCE;

      @Override
      public LineupAvatar create() {
        return LineupAvatar.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName slotType = FieldName.forField("slotType", "slot_type");

      static final FieldName hp = FieldName.forField("hp");

      static final FieldName id = FieldName.forField("id");

      static final FieldName satiety = FieldName.forField("satiety");

      static final FieldName avatarType = FieldName.forField("avatarType", "avatar_type");

      static final FieldName spBar = FieldName.forField("spBar", "sp_bar");
    }
  }
}
