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

public final class JghjjfejplgOuterClass {
  /**
   * <pre>
   *  Shit
   * </pre>
   *
   * Protobuf type {@code Jghjjfejplg}
   */
  public static final class Jghjjfejplg extends ProtoMessage<Jghjjfejplg> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 monster_id = 3;</code>
     */
    private int monsterId;

    /**
     * <code>optional uint32 djdfgcndibo = 7;</code>
     */
    private int djdfgcndibo;

    private Jghjjfejplg() {
    }

    /**
     * <pre>
     *  Shit
     * </pre>
     *
     * @return a new empty instance of {@code Jghjjfejplg}
     */
    public static Jghjjfejplg newInstance() {
      return new Jghjjfejplg();
    }

    /**
     * <code>optional uint32 monster_id = 3;</code>
     * @return whether the monsterId field is set
     */
    public boolean hasMonsterId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 monster_id = 3;</code>
     * @return this
     */
    public Jghjjfejplg clearMonsterId() {
      bitField0_ &= ~0x00000001;
      monsterId = 0;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 3;</code>
     * @return the monsterId
     */
    public int getMonsterId() {
      return monsterId;
    }

    /**
     * <code>optional uint32 monster_id = 3;</code>
     * @param value the monsterId to set
     * @return this
     */
    public Jghjjfejplg setMonsterId(final int value) {
      bitField0_ |= 0x00000001;
      monsterId = value;
      return this;
    }

    /**
     * <code>optional uint32 djdfgcndibo = 7;</code>
     * @return whether the djdfgcndibo field is set
     */
    public boolean hasDjdfgcndibo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 djdfgcndibo = 7;</code>
     * @return this
     */
    public Jghjjfejplg clearDjdfgcndibo() {
      bitField0_ &= ~0x00000002;
      djdfgcndibo = 0;
      return this;
    }

    /**
     * <code>optional uint32 djdfgcndibo = 7;</code>
     * @return the djdfgcndibo
     */
    public int getDjdfgcndibo() {
      return djdfgcndibo;
    }

    /**
     * <code>optional uint32 djdfgcndibo = 7;</code>
     * @param value the djdfgcndibo to set
     * @return this
     */
    public Jghjjfejplg setDjdfgcndibo(final int value) {
      bitField0_ |= 0x00000002;
      djdfgcndibo = value;
      return this;
    }

    @Override
    public Jghjjfejplg copyFrom(final Jghjjfejplg other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        monsterId = other.monsterId;
        djdfgcndibo = other.djdfgcndibo;
      }
      return this;
    }

    @Override
    public Jghjjfejplg mergeFrom(final Jghjjfejplg other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMonsterId()) {
        setMonsterId(other.monsterId);
      }
      if (other.hasDjdfgcndibo()) {
        setDjdfgcndibo(other.djdfgcndibo);
      }
      return this;
    }

    @Override
    public Jghjjfejplg clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      monsterId = 0;
      djdfgcndibo = 0;
      return this;
    }

    @Override
    public Jghjjfejplg clearQuick() {
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
      if (!(o instanceof Jghjjfejplg)) {
        return false;
      }
      Jghjjfejplg other = (Jghjjfejplg) o;
      return bitField0_ == other.bitField0_
        && (!hasMonsterId() || monsterId == other.monsterId)
        && (!hasDjdfgcndibo() || djdfgcndibo == other.djdfgcndibo);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(monsterId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(djdfgcndibo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(monsterId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(djdfgcndibo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Jghjjfejplg mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // monsterId
            monsterId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // djdfgcndibo
            djdfgcndibo = input.readUInt32();
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
        output.writeUInt32(FieldNames.monsterId, monsterId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.djdfgcndibo, djdfgcndibo);
      }
      output.endObject();
    }

    @Override
    public Jghjjfejplg mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1316830571:
          case 2127946656: {
            if (input.isAtField(FieldNames.monsterId)) {
              if (!input.trySkipNullValue()) {
                monsterId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1778341604: {
            if (input.isAtField(FieldNames.djdfgcndibo)) {
              if (!input.trySkipNullValue()) {
                djdfgcndibo = input.readUInt32();
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
    public Jghjjfejplg clone() {
      return new Jghjjfejplg().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Jghjjfejplg parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Jghjjfejplg(), data).checkInitialized();
    }

    public static Jghjjfejplg parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Jghjjfejplg(), input).checkInitialized();
    }

    public static Jghjjfejplg parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Jghjjfejplg(), input).checkInitialized();
    }

    /**
     * @return factory for creating Jghjjfejplg messages
     */
    public static MessageFactory<Jghjjfejplg> getFactory() {
      return JghjjfejplgFactory.INSTANCE;
    }

    private enum JghjjfejplgFactory implements MessageFactory<Jghjjfejplg> {
      INSTANCE;

      @Override
      public Jghjjfejplg create() {
        return Jghjjfejplg.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName monsterId = FieldName.forField("monsterId", "monster_id");

      static final FieldName djdfgcndibo = FieldName.forField("djdfgcndibo");
    }
  }
}