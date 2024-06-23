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

public final class EnterRogueCsReqOuterClass {
  /**
   * Protobuf type {@code EnterRogueCsReq}
   */
  public static final class EnterRogueCsReq extends ProtoMessage<EnterRogueCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 area_id = 9;</code>
     */
    private int areaId;

    /**
     * <code>optional uint32 scene_event_id = 15;</code>
     */
    private int sceneEventId;

    private EnterRogueCsReq() {
    }

    /**
     * @return a new empty instance of {@code EnterRogueCsReq}
     */
    public static EnterRogueCsReq newInstance() {
      return new EnterRogueCsReq();
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @return whether the areaId field is set
     */
    public boolean hasAreaId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @return this
     */
    public EnterRogueCsReq clearAreaId() {
      bitField0_ &= ~0x00000001;
      areaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @return the areaId
     */
    public int getAreaId() {
      return areaId;
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @param value the areaId to set
     * @return this
     */
    public EnterRogueCsReq setAreaId(final int value) {
      bitField0_ |= 0x00000001;
      areaId = value;
      return this;
    }

    /**
     * <code>optional uint32 scene_event_id = 15;</code>
     * @return whether the sceneEventId field is set
     */
    public boolean hasSceneEventId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 scene_event_id = 15;</code>
     * @return this
     */
    public EnterRogueCsReq clearSceneEventId() {
      bitField0_ &= ~0x00000002;
      sceneEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 scene_event_id = 15;</code>
     * @return the sceneEventId
     */
    public int getSceneEventId() {
      return sceneEventId;
    }

    /**
     * <code>optional uint32 scene_event_id = 15;</code>
     * @param value the sceneEventId to set
     * @return this
     */
    public EnterRogueCsReq setSceneEventId(final int value) {
      bitField0_ |= 0x00000002;
      sceneEventId = value;
      return this;
    }

    @Override
    public EnterRogueCsReq copyFrom(final EnterRogueCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        areaId = other.areaId;
        sceneEventId = other.sceneEventId;
      }
      return this;
    }

    @Override
    public EnterRogueCsReq mergeFrom(final EnterRogueCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAreaId()) {
        setAreaId(other.areaId);
      }
      if (other.hasSceneEventId()) {
        setSceneEventId(other.sceneEventId);
      }
      return this;
    }

    @Override
    public EnterRogueCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      areaId = 0;
      sceneEventId = 0;
      return this;
    }

    @Override
    public EnterRogueCsReq clearQuick() {
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
      if (!(o instanceof EnterRogueCsReq)) {
        return false;
      }
      EnterRogueCsReq other = (EnterRogueCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasAreaId() || areaId == other.areaId)
        && (!hasSceneEventId() || sceneEventId == other.sceneEventId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(sceneEventId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(sceneEventId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnterRogueCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // areaId
            areaId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // sceneEventId
            sceneEventId = input.readUInt32();
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
        output.writeUInt32(FieldNames.areaId, areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.sceneEventId, sceneEventId);
      }
      output.endObject();
    }

    @Override
    public EnterRogueCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1409553784:
          case -746472947: {
            if (input.isAtField(FieldNames.areaId)) {
              if (!input.trySkipNullValue()) {
                areaId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 748898089:
          case 765114163: {
            if (input.isAtField(FieldNames.sceneEventId)) {
              if (!input.trySkipNullValue()) {
                sceneEventId = input.readUInt32();
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
    public EnterRogueCsReq clone() {
      return new EnterRogueCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnterRogueCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnterRogueCsReq(), data).checkInitialized();
    }

    public static EnterRogueCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnterRogueCsReq(), input).checkInitialized();
    }

    public static EnterRogueCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnterRogueCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnterRogueCsReq messages
     */
    public static MessageFactory<EnterRogueCsReq> getFactory() {
      return EnterRogueCsReqFactory.INSTANCE;
    }

    private enum EnterRogueCsReqFactory implements MessageFactory<EnterRogueCsReq> {
      INSTANCE;

      @Override
      public EnterRogueCsReq create() {
        return EnterRogueCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName areaId = FieldName.forField("areaId", "area_id");

      static final FieldName sceneEventId = FieldName.forField("sceneEventId", "scene_event_id");
    }
  }
}
