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

public final class AvatarPathChangedNotifyOuterClass {
  /**
   * <pre>
   *  IFFEIGOPCKC
   * </pre>
   *
   * Protobuf type {@code AvatarPathChangedNotify}
   */
  public static final class AvatarPathChangedNotify extends ProtoMessage<AvatarPathChangedNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 scene_avatar_id = 3;</code>
     */
    private int sceneAvatarId;

    /**
     * <pre>
     *  IPDLPAMOKLD
     * </pre>
     *
     * <code>optional .MultiPathAvatarType multi_path_avatar_type = 9;</code>
     */
    private int multiPathAvatarType;

    private AvatarPathChangedNotify() {
    }

    /**
     * <pre>
     *  IFFEIGOPCKC
     * </pre>
     *
     * @return a new empty instance of {@code AvatarPathChangedNotify}
     */
    public static AvatarPathChangedNotify newInstance() {
      return new AvatarPathChangedNotify();
    }

    /**
     * <code>optional uint32 scene_avatar_id = 3;</code>
     * @return whether the sceneAvatarId field is set
     */
    public boolean hasSceneAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 scene_avatar_id = 3;</code>
     * @return this
     */
    public AvatarPathChangedNotify clearSceneAvatarId() {
      bitField0_ &= ~0x00000001;
      sceneAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 scene_avatar_id = 3;</code>
     * @return the sceneAvatarId
     */
    public int getSceneAvatarId() {
      return sceneAvatarId;
    }

    /**
     * <code>optional uint32 scene_avatar_id = 3;</code>
     * @param value the sceneAvatarId to set
     * @return this
     */
    public AvatarPathChangedNotify setSceneAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      sceneAvatarId = value;
      return this;
    }

    /**
     * <pre>
     *  IPDLPAMOKLD
     * </pre>
     *
     * <code>optional .MultiPathAvatarType multi_path_avatar_type = 9;</code>
     * @return whether the multiPathAvatarType field is set
     */
    public boolean hasMultiPathAvatarType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  IPDLPAMOKLD
     * </pre>
     *
     * <code>optional .MultiPathAvatarType multi_path_avatar_type = 9;</code>
     * @return this
     */
    public AvatarPathChangedNotify clearMultiPathAvatarType() {
      bitField0_ &= ~0x00000002;
      multiPathAvatarType = 0;
      return this;
    }

    /**
     * <pre>
     *  IPDLPAMOKLD
     * </pre>
     *
     * <code>optional .MultiPathAvatarType multi_path_avatar_type = 9;</code>
     * @return the multiPathAvatarType
     */
    public MultiPathAvatarTypeOuterClass.MultiPathAvatarType getMultiPathAvatarType() {
      return MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(multiPathAvatarType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link AvatarPathChangedNotify#getMultiPathAvatarType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getMultiPathAvatarTypeValue() {
      return multiPathAvatarType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link MultiPathAvatarTypeOuterClass.MultiPathAvatarType}. Setting an invalid value
     * can cause {@link AvatarPathChangedNotify#getMultiPathAvatarType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public AvatarPathChangedNotify setMultiPathAvatarTypeValue(final int value) {
      bitField0_ |= 0x00000002;
      multiPathAvatarType = value;
      return this;
    }

    /**
     * <pre>
     *  IPDLPAMOKLD
     * </pre>
     *
     * <code>optional .MultiPathAvatarType multi_path_avatar_type = 9;</code>
     * @param value the multiPathAvatarType to set
     * @return this
     */
    public AvatarPathChangedNotify setMultiPathAvatarType(
        final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value) {
      bitField0_ |= 0x00000002;
      multiPathAvatarType = value.getNumber();
      return this;
    }

    @Override
    public AvatarPathChangedNotify copyFrom(final AvatarPathChangedNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        sceneAvatarId = other.sceneAvatarId;
        multiPathAvatarType = other.multiPathAvatarType;
      }
      return this;
    }

    @Override
    public AvatarPathChangedNotify mergeFrom(final AvatarPathChangedNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSceneAvatarId()) {
        setSceneAvatarId(other.sceneAvatarId);
      }
      if (other.hasMultiPathAvatarType()) {
        setMultiPathAvatarTypeValue(other.multiPathAvatarType);
      }
      return this;
    }

    @Override
    public AvatarPathChangedNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      sceneAvatarId = 0;
      multiPathAvatarType = 0;
      return this;
    }

    @Override
    public AvatarPathChangedNotify clearQuick() {
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
      if (!(o instanceof AvatarPathChangedNotify)) {
        return false;
      }
      AvatarPathChangedNotify other = (AvatarPathChangedNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasSceneAvatarId() || sceneAvatarId == other.sceneAvatarId)
        && (!hasMultiPathAvatarType() || multiPathAvatarType == other.multiPathAvatarType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(sceneAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeEnumNoTag(multiPathAvatarType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(sceneAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(multiPathAvatarType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AvatarPathChangedNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // sceneAvatarId
            sceneAvatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // multiPathAvatarType
            final int value = input.readInt32();
            if (MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value) != null) {
              multiPathAvatarType = value;
              bitField0_ |= 0x00000002;
            }
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
        output.writeUInt32(FieldNames.sceneAvatarId, sceneAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.multiPathAvatarType, multiPathAvatarType, MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
      }
      output.endObject();
    }

    @Override
    public AvatarPathChangedNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1044772608:
          case 1783323086: {
            if (input.isAtField(FieldNames.sceneAvatarId)) {
              if (!input.trySkipNullValue()) {
                sceneAvatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -836825135:
          case 1836822412: {
            if (input.isAtField(FieldNames.multiPathAvatarType)) {
              if (!input.trySkipNullValue()) {
                final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value = input.readEnum(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
                if (value != null) {
                  multiPathAvatarType = value.getNumber();
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
    public AvatarPathChangedNotify clone() {
      return new AvatarPathChangedNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AvatarPathChangedNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AvatarPathChangedNotify(), data).checkInitialized();
    }

    public static AvatarPathChangedNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarPathChangedNotify(), input).checkInitialized();
    }

    public static AvatarPathChangedNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarPathChangedNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating AvatarPathChangedNotify messages
     */
    public static MessageFactory<AvatarPathChangedNotify> getFactory() {
      return AvatarPathChangedNotifyFactory.INSTANCE;
    }

    private enum AvatarPathChangedNotifyFactory implements MessageFactory<AvatarPathChangedNotify> {
      INSTANCE;

      @Override
      public AvatarPathChangedNotify create() {
        return AvatarPathChangedNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName sceneAvatarId = FieldName.forField("sceneAvatarId", "scene_avatar_id");

      static final FieldName multiPathAvatarType = FieldName.forField("multiPathAvatarType", "multi_path_avatar_type");
    }
  }
}
