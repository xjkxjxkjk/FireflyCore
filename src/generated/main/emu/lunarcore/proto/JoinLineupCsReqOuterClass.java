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

public final class JoinLineupCsReqOuterClass {
  /**
   * Protobuf type {@code JoinLineupCsReq}
   */
  public static final class JoinLineupCsReq extends ProtoMessage<JoinLineupCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 slot_type = 2;</code>
     */
    private int slotType;

    /**
     * <code>optional uint32 index = 3;</code>
     */
    private int index;

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional uint32 plane_id = 14;</code>
     */
    private int planeId;

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 9;</code>
     */
    private int extraLineupType;

    /**
     * <code>optional .AvatarType avatar_type = 15;</code>
     */
    private int avatarType;

    /**
     * <code>optional bool is_virtual = 13;</code>
     */
    private boolean isVirtual;

    private JoinLineupCsReq() {
    }

    /**
     * @return a new empty instance of {@code JoinLineupCsReq}
     */
    public static JoinLineupCsReq newInstance() {
      return new JoinLineupCsReq();
    }

    /**
     * <code>optional uint32 slot_type = 2;</code>
     * @return whether the slotType field is set
     */
    public boolean hasSlotType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 slot_type = 2;</code>
     * @return this
     */
    public JoinLineupCsReq clearSlotType() {
      bitField0_ &= ~0x00000001;
      slotType = 0;
      return this;
    }

    /**
     * <code>optional uint32 slot_type = 2;</code>
     * @return the slotType
     */
    public int getSlotType() {
      return slotType;
    }

    /**
     * <code>optional uint32 slot_type = 2;</code>
     * @param value the slotType to set
     * @return this
     */
    public JoinLineupCsReq setSlotType(final int value) {
      bitField0_ |= 0x00000001;
      slotType = value;
      return this;
    }

    /**
     * <code>optional uint32 index = 3;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 index = 3;</code>
     * @return this
     */
    public JoinLineupCsReq clearIndex() {
      bitField0_ &= ~0x00000002;
      index = 0;
      return this;
    }

    /**
     * <code>optional uint32 index = 3;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <code>optional uint32 index = 3;</code>
     * @param value the index to set
     * @return this
     */
    public JoinLineupCsReq setIndex(final int value) {
      bitField0_ |= 0x00000002;
      index = value;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @return this
     */
    public JoinLineupCsReq clearBaseAvatarId() {
      bitField0_ &= ~0x00000004;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 11;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public JoinLineupCsReq setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000004;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 14;</code>
     * @return whether the planeId field is set
     */
    public boolean hasPlaneId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 plane_id = 14;</code>
     * @return this
     */
    public JoinLineupCsReq clearPlaneId() {
      bitField0_ &= ~0x00000008;
      planeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 14;</code>
     * @return the planeId
     */
    public int getPlaneId() {
      return planeId;
    }

    /**
     * <code>optional uint32 plane_id = 14;</code>
     * @param value the planeId to set
     * @return this
     */
    public JoinLineupCsReq setPlaneId(final int value) {
      bitField0_ |= 0x00000008;
      planeId = value;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 9;</code>
     * @return whether the extraLineupType field is set
     */
    public boolean hasExtraLineupType() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 9;</code>
     * @return this
     */
    public JoinLineupCsReq clearExtraLineupType() {
      bitField0_ &= ~0x00000010;
      extraLineupType = 0;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 9;</code>
     * @return the extraLineupType
     */
    public ExtraLineupTypeOuterClass.ExtraLineupType getExtraLineupType() {
      return ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(extraLineupType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link JoinLineupCsReq#getExtraLineupType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getExtraLineupTypeValue() {
      return extraLineupType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ExtraLineupTypeOuterClass.ExtraLineupType}. Setting an invalid value
     * can cause {@link JoinLineupCsReq#getExtraLineupType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public JoinLineupCsReq setExtraLineupTypeValue(final int value) {
      bitField0_ |= 0x00000010;
      extraLineupType = value;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 9;</code>
     * @param value the extraLineupType to set
     * @return this
     */
    public JoinLineupCsReq setExtraLineupType(
        final ExtraLineupTypeOuterClass.ExtraLineupType value) {
      bitField0_ |= 0x00000010;
      extraLineupType = value.getNumber();
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 15;</code>
     * @return whether the avatarType field is set
     */
    public boolean hasAvatarType() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .AvatarType avatar_type = 15;</code>
     * @return this
     */
    public JoinLineupCsReq clearAvatarType() {
      bitField0_ &= ~0x00000020;
      avatarType = 0;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 15;</code>
     * @return the avatarType
     */
    public AvatarTypeOuterClass.AvatarType getAvatarType() {
      return AvatarTypeOuterClass.AvatarType.forNumber(avatarType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link JoinLineupCsReq#getAvatarType()}.getNumber().
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
     * can cause {@link JoinLineupCsReq#getAvatarType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public JoinLineupCsReq setAvatarTypeValue(final int value) {
      bitField0_ |= 0x00000020;
      avatarType = value;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 15;</code>
     * @param value the avatarType to set
     * @return this
     */
    public JoinLineupCsReq setAvatarType(final AvatarTypeOuterClass.AvatarType value) {
      bitField0_ |= 0x00000020;
      avatarType = value.getNumber();
      return this;
    }

    /**
     * <code>optional bool is_virtual = 13;</code>
     * @return whether the isVirtual field is set
     */
    public boolean hasIsVirtual() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional bool is_virtual = 13;</code>
     * @return this
     */
    public JoinLineupCsReq clearIsVirtual() {
      bitField0_ &= ~0x00000040;
      isVirtual = false;
      return this;
    }

    /**
     * <code>optional bool is_virtual = 13;</code>
     * @return the isVirtual
     */
    public boolean getIsVirtual() {
      return isVirtual;
    }

    /**
     * <code>optional bool is_virtual = 13;</code>
     * @param value the isVirtual to set
     * @return this
     */
    public JoinLineupCsReq setIsVirtual(final boolean value) {
      bitField0_ |= 0x00000040;
      isVirtual = value;
      return this;
    }

    @Override
    public JoinLineupCsReq copyFrom(final JoinLineupCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        slotType = other.slotType;
        index = other.index;
        baseAvatarId = other.baseAvatarId;
        planeId = other.planeId;
        extraLineupType = other.extraLineupType;
        avatarType = other.avatarType;
        isVirtual = other.isVirtual;
      }
      return this;
    }

    @Override
    public JoinLineupCsReq mergeFrom(final JoinLineupCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSlotType()) {
        setSlotType(other.slotType);
      }
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasPlaneId()) {
        setPlaneId(other.planeId);
      }
      if (other.hasExtraLineupType()) {
        setExtraLineupTypeValue(other.extraLineupType);
      }
      if (other.hasAvatarType()) {
        setAvatarTypeValue(other.avatarType);
      }
      if (other.hasIsVirtual()) {
        setIsVirtual(other.isVirtual);
      }
      return this;
    }

    @Override
    public JoinLineupCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      slotType = 0;
      index = 0;
      baseAvatarId = 0;
      planeId = 0;
      extraLineupType = 0;
      avatarType = 0;
      isVirtual = false;
      return this;
    }

    @Override
    public JoinLineupCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof JoinLineupCsReq)) {
        return false;
      }
      JoinLineupCsReq other = (JoinLineupCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasSlotType() || slotType == other.slotType)
        && (!hasIndex() || index == other.index)
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasPlaneId() || planeId == other.planeId)
        && (!hasExtraLineupType() || extraLineupType == other.extraLineupType)
        && (!hasAvatarType() || avatarType == other.avatarType)
        && (!hasIsVirtual() || isVirtual == other.isVirtual);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(slotType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(planeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 72);
        output.writeEnumNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 120);
        output.writeEnumNoTag(avatarType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 104);
        output.writeBoolNoTag(isVirtual);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(slotType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(planeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(avatarType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public JoinLineupCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // slotType
            slotType = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // planeId
            planeId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // extraLineupType
            final int value = input.readInt32();
            if (ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(value) != null) {
              extraLineupType = value;
              bitField0_ |= 0x00000010;
            }
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // avatarType
            final int value = input.readInt32();
            if (AvatarTypeOuterClass.AvatarType.forNumber(value) != null) {
              avatarType = value;
              bitField0_ |= 0x00000020;
            }
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // isVirtual
            isVirtual = input.readBool();
            bitField0_ |= 0x00000040;
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
        output.writeUInt32(FieldNames.index, index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.planeId, planeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeEnum(FieldNames.extraLineupType, extraLineupType, ExtraLineupTypeOuterClass.ExtraLineupType.converter());
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeEnum(FieldNames.avatarType, avatarType, AvatarTypeOuterClass.AvatarType.converter());
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.isVirtual, isVirtual);
      }
      output.endObject();
    }

    @Override
    public JoinLineupCsReq mergeFrom(final JsonSource input) throws IOException {
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
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -493896553:
          case 1869097438: {
            if (input.isAtField(FieldNames.planeId)) {
              if (!input.trySkipNullValue()) {
                planeId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -468135527:
          case -1144475077: {
            if (input.isAtField(FieldNames.extraLineupType)) {
              if (!input.trySkipNullValue()) {
                final ExtraLineupTypeOuterClass.ExtraLineupType value = input.readEnum(ExtraLineupTypeOuterClass.ExtraLineupType.converter());
                if (value != null) {
                  extraLineupType = value.getNumber();
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
          case -403148749:
          case 397309536: {
            if (input.isAtField(FieldNames.avatarType)) {
              if (!input.trySkipNullValue()) {
                final AvatarTypeOuterClass.AvatarType value = input.readEnum(AvatarTypeOuterClass.AvatarType.converter());
                if (value != null) {
                  avatarType = value.getNumber();
                  bitField0_ |= 0x00000020;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -113613183:
          case 1966475510: {
            if (input.isAtField(FieldNames.isVirtual)) {
              if (!input.trySkipNullValue()) {
                isVirtual = input.readBool();
                bitField0_ |= 0x00000040;
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
    public JoinLineupCsReq clone() {
      return new JoinLineupCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static JoinLineupCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new JoinLineupCsReq(), data).checkInitialized();
    }

    public static JoinLineupCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new JoinLineupCsReq(), input).checkInitialized();
    }

    public static JoinLineupCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new JoinLineupCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating JoinLineupCsReq messages
     */
    public static MessageFactory<JoinLineupCsReq> getFactory() {
      return JoinLineupCsReqFactory.INSTANCE;
    }

    private enum JoinLineupCsReqFactory implements MessageFactory<JoinLineupCsReq> {
      INSTANCE;

      @Override
      public JoinLineupCsReq create() {
        return JoinLineupCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName slotType = FieldName.forField("slotType", "slot_type");

      static final FieldName index = FieldName.forField("index");

      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName planeId = FieldName.forField("planeId", "plane_id");

      static final FieldName extraLineupType = FieldName.forField("extraLineupType", "extra_lineup_type");

      static final FieldName avatarType = FieldName.forField("avatarType", "avatar_type");

      static final FieldName isVirtual = FieldName.forField("isVirtual", "is_virtual");
    }
  }
}
