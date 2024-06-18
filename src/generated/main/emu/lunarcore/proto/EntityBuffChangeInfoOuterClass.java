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

public final class EntityBuffChangeInfoOuterClass {
  /**
   * <pre>
   *  Dolbeibmila
   * </pre>
   *
   * Protobuf type {@code EntityBuffChangeInfo}
   */
  public static final class EntityBuffChangeInfo extends ProtoMessage<EntityBuffChangeInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 entity_id = 12;</code>
     */
    private int entityId;

    /**
     * <pre>
     *  agceblafbco
     * </pre>
     *
     * <code>optional uint32 remove_buff_id = 15;</code>
     */
    private int removeBuffId;

    /**
     * <code>optional .SceneEntityBuffChangeType reason = 1;</code>
     */
    private int reason;

    /**
     * <pre>
     *  cbkbpgicmbi
     * </pre>
     *
     * <code>optional .BuffInfo add_buff_info = 13;</code>
     */
    private final BuffInfoOuterClass.BuffInfo addBuffInfo = BuffInfoOuterClass.BuffInfo.newInstance();

    private EntityBuffChangeInfo() {
    }

    /**
     * <pre>
     *  Dolbeibmila
     * </pre>
     *
     * @return a new empty instance of {@code EntityBuffChangeInfo}
     */
    public static EntityBuffChangeInfo newInstance() {
      return new EntityBuffChangeInfo();
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @return this
     */
    public EntityBuffChangeInfo clearEntityId() {
      bitField0_ &= ~0x00000001;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 12;</code>
     * @param value the entityId to set
     * @return this
     */
    public EntityBuffChangeInfo setEntityId(final int value) {
      bitField0_ |= 0x00000001;
      entityId = value;
      return this;
    }

    /**
     * <pre>
     *  agceblafbco
     * </pre>
     *
     * <code>optional uint32 remove_buff_id = 15;</code>
     * @return whether the removeBuffId field is set
     */
    public boolean hasRemoveBuffId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  agceblafbco
     * </pre>
     *
     * <code>optional uint32 remove_buff_id = 15;</code>
     * @return this
     */
    public EntityBuffChangeInfo clearRemoveBuffId() {
      bitField0_ &= ~0x00000002;
      removeBuffId = 0;
      return this;
    }

    /**
     * <pre>
     *  agceblafbco
     * </pre>
     *
     * <code>optional uint32 remove_buff_id = 15;</code>
     * @return the removeBuffId
     */
    public int getRemoveBuffId() {
      return removeBuffId;
    }

    /**
     * <pre>
     *  agceblafbco
     * </pre>
     *
     * <code>optional uint32 remove_buff_id = 15;</code>
     * @param value the removeBuffId to set
     * @return this
     */
    public EntityBuffChangeInfo setRemoveBuffId(final int value) {
      bitField0_ |= 0x00000002;
      removeBuffId = value;
      return this;
    }

    /**
     * <code>optional .SceneEntityBuffChangeType reason = 1;</code>
     * @return whether the reason field is set
     */
    public boolean hasReason() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .SceneEntityBuffChangeType reason = 1;</code>
     * @return this
     */
    public EntityBuffChangeInfo clearReason() {
      bitField0_ &= ~0x00000004;
      reason = 0;
      return this;
    }

    /**
     * <code>optional .SceneEntityBuffChangeType reason = 1;</code>
     * @return the reason
     */
    public SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType getReason() {
      return SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType.forNumber(reason);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link EntityBuffChangeInfo#getReason()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getReasonValue() {
      return reason;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType}. Setting an invalid value
     * can cause {@link EntityBuffChangeInfo#getReason()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public EntityBuffChangeInfo setReasonValue(final int value) {
      bitField0_ |= 0x00000004;
      reason = value;
      return this;
    }

    /**
     * <code>optional .SceneEntityBuffChangeType reason = 1;</code>
     * @param value the reason to set
     * @return this
     */
    public EntityBuffChangeInfo setReason(
        final SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType value) {
      bitField0_ |= 0x00000004;
      reason = value.getNumber();
      return this;
    }

    /**
     * <pre>
     *  cbkbpgicmbi
     * </pre>
     *
     * <code>optional .BuffInfo add_buff_info = 13;</code>
     * @return whether the addBuffInfo field is set
     */
    public boolean hasAddBuffInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  cbkbpgicmbi
     * </pre>
     *
     * <code>optional .BuffInfo add_buff_info = 13;</code>
     * @return this
     */
    public EntityBuffChangeInfo clearAddBuffInfo() {
      bitField0_ &= ~0x00000008;
      addBuffInfo.clear();
      return this;
    }

    /**
     * <pre>
     *  cbkbpgicmbi
     * </pre>
     *
     * <code>optional .BuffInfo add_buff_info = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAddBuffInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public BuffInfoOuterClass.BuffInfo getAddBuffInfo() {
      return addBuffInfo;
    }

    /**
     * <pre>
     *  cbkbpgicmbi
     * </pre>
     *
     * <code>optional .BuffInfo add_buff_info = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public BuffInfoOuterClass.BuffInfo getMutableAddBuffInfo() {
      bitField0_ |= 0x00000008;
      return addBuffInfo;
    }

    /**
     * <pre>
     *  cbkbpgicmbi
     * </pre>
     *
     * <code>optional .BuffInfo add_buff_info = 13;</code>
     * @param value the addBuffInfo to set
     * @return this
     */
    public EntityBuffChangeInfo setAddBuffInfo(final BuffInfoOuterClass.BuffInfo value) {
      bitField0_ |= 0x00000008;
      addBuffInfo.copyFrom(value);
      return this;
    }

    @Override
    public EntityBuffChangeInfo copyFrom(final EntityBuffChangeInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entityId = other.entityId;
        removeBuffId = other.removeBuffId;
        reason = other.reason;
        addBuffInfo.copyFrom(other.addBuffInfo);
      }
      return this;
    }

    @Override
    public EntityBuffChangeInfo mergeFrom(final EntityBuffChangeInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasRemoveBuffId()) {
        setRemoveBuffId(other.removeBuffId);
      }
      if (other.hasReason()) {
        setReasonValue(other.reason);
      }
      if (other.hasAddBuffInfo()) {
        getMutableAddBuffInfo().mergeFrom(other.addBuffInfo);
      }
      return this;
    }

    @Override
    public EntityBuffChangeInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityId = 0;
      removeBuffId = 0;
      reason = 0;
      addBuffInfo.clear();
      return this;
    }

    @Override
    public EntityBuffChangeInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      addBuffInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EntityBuffChangeInfo)) {
        return false;
      }
      EntityBuffChangeInfo other = (EntityBuffChangeInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasRemoveBuffId() || removeBuffId == other.removeBuffId)
        && (!hasReason() || reason == other.reason)
        && (!hasAddBuffInfo() || addBuffInfo.equals(other.addBuffInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(removeBuffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 8);
        output.writeEnumNoTag(reason);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(addBuffInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(removeBuffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(reason);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(addBuffInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EntityBuffChangeInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // removeBuffId
            removeBuffId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // reason
            final int value = input.readInt32();
            if (SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType.forNumber(value) != null) {
              reason = value;
              bitField0_ |= 0x00000004;
            }
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // addBuffInfo
            input.readMessage(addBuffInfo);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.removeBuffId, removeBuffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.reason, reason, SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType.converter());
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.addBuffInfo, addBuffInfo);
      }
      output.endObject();
    }

    @Override
    public EntityBuffChangeInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1339555214:
          case 927119308: {
            if (input.isAtField(FieldNames.removeBuffId)) {
              if (!input.trySkipNullValue()) {
                removeBuffId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -934964668: {
            if (input.isAtField(FieldNames.reason)) {
              if (!input.trySkipNullValue()) {
                final SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType value = input.readEnum(SceneEntityBuffChangeTypeOuterClass.SceneEntityBuffChangeType.converter());
                if (value != null) {
                  reason = value.getNumber();
                  bitField0_ |= 0x00000004;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1797813090:
          case 888334076: {
            if (input.isAtField(FieldNames.addBuffInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(addBuffInfo);
                bitField0_ |= 0x00000008;
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
    public EntityBuffChangeInfo clone() {
      return new EntityBuffChangeInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EntityBuffChangeInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EntityBuffChangeInfo(), data).checkInitialized();
    }

    public static EntityBuffChangeInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EntityBuffChangeInfo(), input).checkInitialized();
    }

    public static EntityBuffChangeInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EntityBuffChangeInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating EntityBuffChangeInfo messages
     */
    public static MessageFactory<EntityBuffChangeInfo> getFactory() {
      return EntityBuffChangeInfoFactory.INSTANCE;
    }

    private enum EntityBuffChangeInfoFactory implements MessageFactory<EntityBuffChangeInfo> {
      INSTANCE;

      @Override
      public EntityBuffChangeInfo create() {
        return EntityBuffChangeInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName removeBuffId = FieldName.forField("removeBuffId", "remove_buff_id");

      static final FieldName reason = FieldName.forField("reason");

      static final FieldName addBuffInfo = FieldName.forField("addBuffInfo", "add_buff_info");
    }
  }
}
