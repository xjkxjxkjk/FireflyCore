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

public final class SceneEnterStageCsReqOuterClass {
  /**
   * Protobuf type {@code SceneEnterStageCsReq}
   */
  public static final class SceneEnterStageCsReq extends ProtoMessage<SceneEnterStageCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * CAMLHBEGNMO HADHNDGJFGL = 2;
     * </pre>
     *
     * <code>optional uint32 scene_event_id = 14;</code>
     */
    private int sceneEventId;

    /**
     * <code>optional bool NNNCABEMAEB = 3;</code>
     */
    private boolean nNNCABEMAEB;

    private SceneEnterStageCsReq() {
    }

    /**
     * @return a new empty instance of {@code SceneEnterStageCsReq}
     */
    public static SceneEnterStageCsReq newInstance() {
      return new SceneEnterStageCsReq();
    }

    /**
     * <pre>
     * CAMLHBEGNMO HADHNDGJFGL = 2;
     * </pre>
     *
     * <code>optional uint32 scene_event_id = 14;</code>
     * @return whether the sceneEventId field is set
     */
    public boolean hasSceneEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * CAMLHBEGNMO HADHNDGJFGL = 2;
     * </pre>
     *
     * <code>optional uint32 scene_event_id = 14;</code>
     * @return this
     */
    public SceneEnterStageCsReq clearSceneEventId() {
      bitField0_ &= ~0x00000001;
      sceneEventId = 0;
      return this;
    }

    /**
     * <pre>
     * CAMLHBEGNMO HADHNDGJFGL = 2;
     * </pre>
     *
     * <code>optional uint32 scene_event_id = 14;</code>
     * @return the sceneEventId
     */
    public int getSceneEventId() {
      return sceneEventId;
    }

    /**
     * <pre>
     * CAMLHBEGNMO HADHNDGJFGL = 2;
     * </pre>
     *
     * <code>optional uint32 scene_event_id = 14;</code>
     * @param value the sceneEventId to set
     * @return this
     */
    public SceneEnterStageCsReq setSceneEventId(final int value) {
      bitField0_ |= 0x00000001;
      sceneEventId = value;
      return this;
    }

    /**
     * <code>optional bool NNNCABEMAEB = 3;</code>
     * @return whether the nNNCABEMAEB field is set
     */
    public boolean hasNNNCABEMAEB() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool NNNCABEMAEB = 3;</code>
     * @return this
     */
    public SceneEnterStageCsReq clearNNNCABEMAEB() {
      bitField0_ &= ~0x00000002;
      nNNCABEMAEB = false;
      return this;
    }

    /**
     * <code>optional bool NNNCABEMAEB = 3;</code>
     * @return the nNNCABEMAEB
     */
    public boolean getNNNCABEMAEB() {
      return nNNCABEMAEB;
    }

    /**
     * <code>optional bool NNNCABEMAEB = 3;</code>
     * @param value the nNNCABEMAEB to set
     * @return this
     */
    public SceneEnterStageCsReq setNNNCABEMAEB(final boolean value) {
      bitField0_ |= 0x00000002;
      nNNCABEMAEB = value;
      return this;
    }

    @Override
    public SceneEnterStageCsReq copyFrom(final SceneEnterStageCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        sceneEventId = other.sceneEventId;
        nNNCABEMAEB = other.nNNCABEMAEB;
      }
      return this;
    }

    @Override
    public SceneEnterStageCsReq mergeFrom(final SceneEnterStageCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSceneEventId()) {
        setSceneEventId(other.sceneEventId);
      }
      if (other.hasNNNCABEMAEB()) {
        setNNNCABEMAEB(other.nNNCABEMAEB);
      }
      return this;
    }

    @Override
    public SceneEnterStageCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      sceneEventId = 0;
      nNNCABEMAEB = false;
      return this;
    }

    @Override
    public SceneEnterStageCsReq clearQuick() {
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
      if (!(o instanceof SceneEnterStageCsReq)) {
        return false;
      }
      SceneEnterStageCsReq other = (SceneEnterStageCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasSceneEventId() || sceneEventId == other.sceneEventId)
        && (!hasNNNCABEMAEB() || nNNCABEMAEB == other.nNNCABEMAEB);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(sceneEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeBoolNoTag(nNNCABEMAEB);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(sceneEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEnterStageCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // sceneEventId
            sceneEventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // nNNCABEMAEB
            nNNCABEMAEB = input.readBool();
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
        output.writeUInt32(FieldNames.sceneEventId, sceneEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.nNNCABEMAEB, nNNCABEMAEB);
      }
      output.endObject();
    }

    @Override
    public SceneEnterStageCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 748898089:
          case 765114163: {
            if (input.isAtField(FieldNames.sceneEventId)) {
              if (!input.trySkipNullValue()) {
                sceneEventId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 199013984: {
            if (input.isAtField(FieldNames.nNNCABEMAEB)) {
              if (!input.trySkipNullValue()) {
                nNNCABEMAEB = input.readBool();
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
    public SceneEnterStageCsReq clone() {
      return new SceneEnterStageCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEnterStageCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEnterStageCsReq(), data).checkInitialized();
    }

    public static SceneEnterStageCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEnterStageCsReq(), input).checkInitialized();
    }

    public static SceneEnterStageCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEnterStageCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEnterStageCsReq messages
     */
    public static MessageFactory<SceneEnterStageCsReq> getFactory() {
      return SceneEnterStageCsReqFactory.INSTANCE;
    }

    private enum SceneEnterStageCsReqFactory implements MessageFactory<SceneEnterStageCsReq> {
      INSTANCE;

      @Override
      public SceneEnterStageCsReq create() {
        return SceneEnterStageCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName sceneEventId = FieldName.forField("sceneEventId", "scene_event_id");

      static final FieldName nNNCABEMAEB = FieldName.forField("NNNCABEMAEB");
    }
  }
}
