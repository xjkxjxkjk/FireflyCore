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

public final class UnlockTutorialScRspOuterClass {
  /**
   * Protobuf type {@code UnlockTutorialScRsp}
   */
  public static final class UnlockTutorialScRsp extends ProtoMessage<UnlockTutorialScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .Tutorial tutorial = 3;</code>
     */
    private final TutorialOuterClass.Tutorial tutorial = TutorialOuterClass.Tutorial.newInstance();

    private UnlockTutorialScRsp() {
    }

    /**
     * @return a new empty instance of {@code UnlockTutorialScRsp}
     */
    public static UnlockTutorialScRsp newInstance() {
      return new UnlockTutorialScRsp();
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public UnlockTutorialScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public UnlockTutorialScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .Tutorial tutorial = 3;</code>
     * @return whether the tutorial field is set
     */
    public boolean hasTutorial() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .Tutorial tutorial = 3;</code>
     * @return this
     */
    public UnlockTutorialScRsp clearTutorial() {
      bitField0_ &= ~0x00000002;
      tutorial.clear();
      return this;
    }

    /**
     * <code>optional .Tutorial tutorial = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTutorial()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public TutorialOuterClass.Tutorial getTutorial() {
      return tutorial;
    }

    /**
     * <code>optional .Tutorial tutorial = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public TutorialOuterClass.Tutorial getMutableTutorial() {
      bitField0_ |= 0x00000002;
      return tutorial;
    }

    /**
     * <code>optional .Tutorial tutorial = 3;</code>
     * @param value the tutorial to set
     * @return this
     */
    public UnlockTutorialScRsp setTutorial(final TutorialOuterClass.Tutorial value) {
      bitField0_ |= 0x00000002;
      tutorial.copyFrom(value);
      return this;
    }

    @Override
    public UnlockTutorialScRsp copyFrom(final UnlockTutorialScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        tutorial.copyFrom(other.tutorial);
      }
      return this;
    }

    @Override
    public UnlockTutorialScRsp mergeFrom(final UnlockTutorialScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTutorial()) {
        getMutableTutorial().mergeFrom(other.tutorial);
      }
      return this;
    }

    @Override
    public UnlockTutorialScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      tutorial.clear();
      return this;
    }

    @Override
    public UnlockTutorialScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      tutorial.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof UnlockTutorialScRsp)) {
        return false;
      }
      UnlockTutorialScRsp other = (UnlockTutorialScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTutorial() || tutorial.equals(other.tutorial));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(tutorial);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(tutorial);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UnlockTutorialScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // tutorial
            input.readMessage(tutorial);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.tutorial, tutorial);
      }
      output.endObject();
    }

    @Override
    public UnlockTutorialScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 193276766: {
            if (input.isAtField(FieldNames.tutorial)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(tutorial);
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
    public UnlockTutorialScRsp clone() {
      return new UnlockTutorialScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UnlockTutorialScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UnlockTutorialScRsp(), data).checkInitialized();
    }

    public static UnlockTutorialScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockTutorialScRsp(), input).checkInitialized();
    }

    public static UnlockTutorialScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockTutorialScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating UnlockTutorialScRsp messages
     */
    public static MessageFactory<UnlockTutorialScRsp> getFactory() {
      return UnlockTutorialScRspFactory.INSTANCE;
    }

    private enum UnlockTutorialScRspFactory implements MessageFactory<UnlockTutorialScRsp> {
      INSTANCE;

      @Override
      public UnlockTutorialScRsp create() {
        return UnlockTutorialScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName tutorial = FieldName.forField("tutorial");
    }
  }
}
