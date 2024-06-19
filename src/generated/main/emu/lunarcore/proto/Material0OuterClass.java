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

public final class Material0OuterClass {
  /**
   * <pre>
   *  DNBDEDJHHKP
   * </pre>
   *
   * Protobuf type {@code Material0}
   */
  public static final class Material0 extends ProtoMessage<Material0> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 2;
     * </pre>
     *
     * <code>optional uint32 num = 5;</code>
     */
    private int num;

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 7;
     * </pre>
     *
     * <code>optional uint32 tid = 12;</code>
     */
    private int tid;

    private Material0() {
    }

    /**
     * <pre>
     *  DNBDEDJHHKP
     * </pre>
     *
     * @return a new empty instance of {@code Material0}
     */
    public static Material0 newInstance() {
      return new Material0();
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 2;
     * </pre>
     *
     * <code>optional uint32 num = 5;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 2;
     * </pre>
     *
     * <code>optional uint32 num = 5;</code>
     * @return this
     */
    public Material0 clearNum() {
      bitField0_ &= ~0x00000001;
      num = 0;
      return this;
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 2;
     * </pre>
     *
     * <code>optional uint32 num = 5;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 2;
     * </pre>
     *
     * <code>optional uint32 num = 5;</code>
     * @param value the num to set
     * @return this
     */
    public Material0 setNum(final int value) {
      bitField0_ |= 0x00000001;
      num = value;
      return this;
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 7;
     * </pre>
     *
     * <code>optional uint32 tid = 12;</code>
     * @return whether the tid field is set
     */
    public boolean hasTid() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 7;
     * </pre>
     *
     * <code>optional uint32 tid = 12;</code>
     * @return this
     */
    public Material0 clearTid() {
      bitField0_ &= ~0x00000002;
      tid = 0;
      return this;
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 7;
     * </pre>
     *
     * <code>optional uint32 tid = 12;</code>
     * @return the tid
     */
    public int getTid() {
      return tid;
    }

    /**
     * <pre>
     *  uint64 MOIJHJJLOGJ = 7;
     * </pre>
     *
     * <code>optional uint32 tid = 12;</code>
     * @param value the tid to set
     * @return this
     */
    public Material0 setTid(final int value) {
      bitField0_ |= 0x00000002;
      tid = value;
      return this;
    }

    @Override
    public Material0 copyFrom(final Material0 other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        num = other.num;
        tid = other.tid;
      }
      return this;
    }

    @Override
    public Material0 mergeFrom(final Material0 other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNum()) {
        setNum(other.num);
      }
      if (other.hasTid()) {
        setTid(other.tid);
      }
      return this;
    }

    @Override
    public Material0 clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      num = 0;
      tid = 0;
      return this;
    }

    @Override
    public Material0 clearQuick() {
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
      if (!(o instanceof Material0)) {
        return false;
      }
      Material0 other = (Material0) o;
      return bitField0_ == other.bitField0_
        && (!hasNum() || num == other.num)
        && (!hasTid() || tid == other.tid);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(num);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(tid);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(tid);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Material0 mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // num
            num = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // tid
            tid = input.readUInt32();
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
        output.writeUInt32(FieldNames.num, num);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.tid, tid);
      }
      output.endObject();
    }

    @Override
    public Material0 mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 114831: {
            if (input.isAtField(FieldNames.tid)) {
              if (!input.trySkipNullValue()) {
                tid = input.readUInt32();
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
    public Material0 clone() {
      return new Material0().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Material0 parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Material0(), data).checkInitialized();
    }

    public static Material0 parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Material0(), input).checkInitialized();
    }

    public static Material0 parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Material0(), input).checkInitialized();
    }

    /**
     * @return factory for creating Material0 messages
     */
    public static MessageFactory<Material0> getFactory() {
      return Material0Factory.INSTANCE;
    }

    private enum Material0Factory implements MessageFactory<Material0> {
      INSTANCE;

      @Override
      public Material0 create() {
        return Material0.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName num = FieldName.forField("num");

      static final FieldName tid = FieldName.forField("tid");
    }
  }
}
