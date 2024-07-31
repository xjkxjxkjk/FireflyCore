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

public final class AvatarExpUpCsReqOuterClass {
  /**
   * Protobuf type {@code AvatarExpUpCsReq}
   */
  public static final class AvatarExpUpCsReq extends ProtoMessage<AvatarExpUpCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 base_avatar_id = 1;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional .ItemCostList use_item_list = 4;</code>
     */
    private final ItemCostListOuterClass.ItemCostList useItemList = ItemCostListOuterClass.ItemCostList.newInstance();

    private AvatarExpUpCsReq() {
    }

    /**
     * @return a new empty instance of {@code AvatarExpUpCsReq}
     */
    public static AvatarExpUpCsReq newInstance() {
      return new AvatarExpUpCsReq();
    }

    /**
     * <code>optional uint32 base_avatar_id = 1;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 1;</code>
     * @return this
     */
    public AvatarExpUpCsReq clearBaseAvatarId() {
      bitField0_ &= ~0x00000001;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 1;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 1;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public AvatarExpUpCsReq setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional .ItemCostList use_item_list = 4;</code>
     * @return whether the useItemList field is set
     */
    public boolean hasUseItemList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ItemCostList use_item_list = 4;</code>
     * @return this
     */
    public AvatarExpUpCsReq clearUseItemList() {
      bitField0_ &= ~0x00000002;
      useItemList.clear();
      return this;
    }

    /**
     * <code>optional .ItemCostList use_item_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUseItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getUseItemList() {
      return useItemList;
    }

    /**
     * <code>optional .ItemCostList use_item_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableUseItemList() {
      bitField0_ |= 0x00000002;
      return useItemList;
    }

    /**
     * <code>optional .ItemCostList use_item_list = 4;</code>
     * @param value the useItemList to set
     * @return this
     */
    public AvatarExpUpCsReq setUseItemList(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000002;
      useItemList.copyFrom(value);
      return this;
    }

    @Override
    public AvatarExpUpCsReq copyFrom(final AvatarExpUpCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        baseAvatarId = other.baseAvatarId;
        useItemList.copyFrom(other.useItemList);
      }
      return this;
    }

    @Override
    public AvatarExpUpCsReq mergeFrom(final AvatarExpUpCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasUseItemList()) {
        getMutableUseItemList().mergeFrom(other.useItemList);
      }
      return this;
    }

    @Override
    public AvatarExpUpCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      baseAvatarId = 0;
      useItemList.clear();
      return this;
    }

    @Override
    public AvatarExpUpCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      useItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof AvatarExpUpCsReq)) {
        return false;
      }
      AvatarExpUpCsReq other = (AvatarExpUpCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasUseItemList() || useItemList.equals(other.useItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(useItemList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(useItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AvatarExpUpCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // useItemList
            input.readMessage(useItemList);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.useItemList, useItemList);
      }
      output.endObject();
    }

    @Override
    public AvatarExpUpCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1836478216:
          case 1552393618: {
            if (input.isAtField(FieldNames.useItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(useItemList);
                bitField0_ |= 0x00000002;
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
    public AvatarExpUpCsReq clone() {
      return new AvatarExpUpCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AvatarExpUpCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AvatarExpUpCsReq(), data).checkInitialized();
    }

    public static AvatarExpUpCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarExpUpCsReq(), input).checkInitialized();
    }

    public static AvatarExpUpCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarExpUpCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating AvatarExpUpCsReq messages
     */
    public static MessageFactory<AvatarExpUpCsReq> getFactory() {
      return AvatarExpUpCsReqFactory.INSTANCE;
    }

    private enum AvatarExpUpCsReqFactory implements MessageFactory<AvatarExpUpCsReq> {
      INSTANCE;

      @Override
      public AvatarExpUpCsReq create() {
        return AvatarExpUpCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName useItemList = FieldName.forField("useItemList", "use_item_list");
    }
  }
}
