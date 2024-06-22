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

public final class SceneUpdatePositionVersionNotifyOuterClass {
  /**
   * Protobuf type {@code SceneUpdatePositionVersionNotify}
   */
  public static final class SceneUpdatePositionVersionNotify extends ProtoMessage<SceneUpdatePositionVersionNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  LDEBGMDKOKP
     * </pre>
     *
     * <code>optional uint32 pos_version = 10;</code>
     */
    private int posVersion;

    private SceneUpdatePositionVersionNotify() {
    }

    /**
     * @return a new empty instance of {@code SceneUpdatePositionVersionNotify}
     */
    public static SceneUpdatePositionVersionNotify newInstance() {
      return new SceneUpdatePositionVersionNotify();
    }

    /**
     * <pre>
     *  LDEBGMDKOKP
     * </pre>
     *
     * <code>optional uint32 pos_version = 10;</code>
     * @return whether the posVersion field is set
     */
    public boolean hasPosVersion() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  LDEBGMDKOKP
     * </pre>
     *
     * <code>optional uint32 pos_version = 10;</code>
     * @return this
     */
    public SceneUpdatePositionVersionNotify clearPosVersion() {
      bitField0_ &= ~0x00000001;
      posVersion = 0;
      return this;
    }

    /**
     * <pre>
     *  LDEBGMDKOKP
     * </pre>
     *
     * <code>optional uint32 pos_version = 10;</code>
     * @return the posVersion
     */
    public int getPosVersion() {
      return posVersion;
    }

    /**
     * <pre>
     *  LDEBGMDKOKP
     * </pre>
     *
     * <code>optional uint32 pos_version = 10;</code>
     * @param value the posVersion to set
     * @return this
     */
    public SceneUpdatePositionVersionNotify setPosVersion(final int value) {
      bitField0_ |= 0x00000001;
      posVersion = value;
      return this;
    }

    @Override
    public SceneUpdatePositionVersionNotify copyFrom(final SceneUpdatePositionVersionNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        posVersion = other.posVersion;
      }
      return this;
    }

    @Override
    public SceneUpdatePositionVersionNotify mergeFrom(
        final SceneUpdatePositionVersionNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPosVersion()) {
        setPosVersion(other.posVersion);
      }
      return this;
    }

    @Override
    public SceneUpdatePositionVersionNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      posVersion = 0;
      return this;
    }

    @Override
    public SceneUpdatePositionVersionNotify clearQuick() {
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
      if (!(o instanceof SceneUpdatePositionVersionNotify)) {
        return false;
      }
      SceneUpdatePositionVersionNotify other = (SceneUpdatePositionVersionNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasPosVersion() || posVersion == other.posVersion);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(posVersion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(posVersion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneUpdatePositionVersionNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // posVersion
            posVersion = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.posVersion, posVersion);
      }
      output.endObject();
    }

    @Override
    public SceneUpdatePositionVersionNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1277328356:
          case 1277747693: {
            if (input.isAtField(FieldNames.posVersion)) {
              if (!input.trySkipNullValue()) {
                posVersion = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public SceneUpdatePositionVersionNotify clone() {
      return new SceneUpdatePositionVersionNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneUpdatePositionVersionNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneUpdatePositionVersionNotify(), data).checkInitialized();
    }

    public static SceneUpdatePositionVersionNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SceneUpdatePositionVersionNotify(), input).checkInitialized();
    }

    public static SceneUpdatePositionVersionNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SceneUpdatePositionVersionNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneUpdatePositionVersionNotify messages
     */
    public static MessageFactory<SceneUpdatePositionVersionNotify> getFactory() {
      return SceneUpdatePositionVersionNotifyFactory.INSTANCE;
    }

    private enum SceneUpdatePositionVersionNotifyFactory implements MessageFactory<SceneUpdatePositionVersionNotify> {
      INSTANCE;

      @Override
      public SceneUpdatePositionVersionNotify create() {
        return SceneUpdatePositionVersionNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName posVersion = FieldName.forField("posVersion", "pos_version");
    }
  }
}
