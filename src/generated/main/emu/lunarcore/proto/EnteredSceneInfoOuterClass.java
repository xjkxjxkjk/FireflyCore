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

public final class EnteredSceneInfoOuterClass {
  /**
   * <pre>
   *  Hhglkmjngeg
   * </pre>
   *
   * Protobuf type {@code EnteredSceneInfo}
   */
  public static final class EnteredSceneInfo extends ProtoMessage<EnteredSceneInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 plane_id = 7;</code>
     */
    private int planeId;

    /**
     * <code>optional uint32 floor_id = 15;</code>
     */
    private int floorId;

    private EnteredSceneInfo() {
    }

    /**
     * <pre>
     *  Hhglkmjngeg
     * </pre>
     *
     * @return a new empty instance of {@code EnteredSceneInfo}
     */
    public static EnteredSceneInfo newInstance() {
      return new EnteredSceneInfo();
    }

    /**
     * <code>optional uint32 plane_id = 7;</code>
     * @return whether the planeId field is set
     */
    public boolean hasPlaneId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 plane_id = 7;</code>
     * @return this
     */
    public EnteredSceneInfo clearPlaneId() {
      bitField0_ &= ~0x00000001;
      planeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 7;</code>
     * @return the planeId
     */
    public int getPlaneId() {
      return planeId;
    }

    /**
     * <code>optional uint32 plane_id = 7;</code>
     * @param value the planeId to set
     * @return this
     */
    public EnteredSceneInfo setPlaneId(final int value) {
      bitField0_ |= 0x00000001;
      planeId = value;
      return this;
    }

    /**
     * <code>optional uint32 floor_id = 15;</code>
     * @return whether the floorId field is set
     */
    public boolean hasFloorId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 floor_id = 15;</code>
     * @return this
     */
    public EnteredSceneInfo clearFloorId() {
      bitField0_ &= ~0x00000002;
      floorId = 0;
      return this;
    }

    /**
     * <code>optional uint32 floor_id = 15;</code>
     * @return the floorId
     */
    public int getFloorId() {
      return floorId;
    }

    /**
     * <code>optional uint32 floor_id = 15;</code>
     * @param value the floorId to set
     * @return this
     */
    public EnteredSceneInfo setFloorId(final int value) {
      bitField0_ |= 0x00000002;
      floorId = value;
      return this;
    }

    @Override
    public EnteredSceneInfo copyFrom(final EnteredSceneInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        planeId = other.planeId;
        floorId = other.floorId;
      }
      return this;
    }

    @Override
    public EnteredSceneInfo mergeFrom(final EnteredSceneInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPlaneId()) {
        setPlaneId(other.planeId);
      }
      if (other.hasFloorId()) {
        setFloorId(other.floorId);
      }
      return this;
    }

    @Override
    public EnteredSceneInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      planeId = 0;
      floorId = 0;
      return this;
    }

    @Override
    public EnteredSceneInfo clearQuick() {
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
      if (!(o instanceof EnteredSceneInfo)) {
        return false;
      }
      EnteredSceneInfo other = (EnteredSceneInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasPlaneId() || planeId == other.planeId)
        && (!hasFloorId() || floorId == other.floorId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(floorId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(floorId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnteredSceneInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // planeId
            planeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // floorId
            floorId = input.readUInt32();
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
        output.writeUInt32(FieldNames.planeId, planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.floorId, floorId);
      }
      output.endObject();
    }

    @Override
    public EnteredSceneInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -493896553:
          case 1869097438: {
            if (input.isAtField(FieldNames.planeId)) {
              if (!input.trySkipNullValue()) {
                planeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -766027193:
          case 2022982190: {
            if (input.isAtField(FieldNames.floorId)) {
              if (!input.trySkipNullValue()) {
                floorId = input.readUInt32();
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
    public EnteredSceneInfo clone() {
      return new EnteredSceneInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnteredSceneInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnteredSceneInfo(), data).checkInitialized();
    }

    public static EnteredSceneInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnteredSceneInfo(), input).checkInitialized();
    }

    public static EnteredSceneInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnteredSceneInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnteredSceneInfo messages
     */
    public static MessageFactory<EnteredSceneInfo> getFactory() {
      return EnteredSceneInfoFactory.INSTANCE;
    }

    private enum EnteredSceneInfoFactory implements MessageFactory<EnteredSceneInfo> {
      INSTANCE;

      @Override
      public EnteredSceneInfo create() {
        return EnteredSceneInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName planeId = FieldName.forField("planeId", "plane_id");

      static final FieldName floorId = FieldName.forField("floorId", "floor_id");
    }
  }
}
