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

public final class GetRogueTalentInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetRogueTalentInfoScRsp}
   */
  public static final class GetRogueTalentInfoScRsp extends ProtoMessage<GetRogueTalentInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 14;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueTalentInfo talent_info = 8;</code>
     */
    private final RogueTalentInfoOuterClass.RogueTalentInfo talentInfo = RogueTalentInfoOuterClass.RogueTalentInfo.newInstance();

    private GetRogueTalentInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetRogueTalentInfoScRsp}
     */
    public static GetRogueTalentInfoScRsp newInstance() {
      return new GetRogueTalentInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return this
     */
    public GetRogueTalentInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetRogueTalentInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueTalentInfo talent_info = 8;</code>
     * @return whether the talentInfo field is set
     */
    public boolean hasTalentInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueTalentInfo talent_info = 8;</code>
     * @return this
     */
    public GetRogueTalentInfoScRsp clearTalentInfo() {
      bitField0_ &= ~0x00000002;
      talentInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueTalentInfo talent_info = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTalentInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueTalentInfoOuterClass.RogueTalentInfo getTalentInfo() {
      return talentInfo;
    }

    /**
     * <code>optional .RogueTalentInfo talent_info = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueTalentInfoOuterClass.RogueTalentInfo getMutableTalentInfo() {
      bitField0_ |= 0x00000002;
      return talentInfo;
    }

    /**
     * <code>optional .RogueTalentInfo talent_info = 8;</code>
     * @param value the talentInfo to set
     * @return this
     */
    public GetRogueTalentInfoScRsp setTalentInfo(
        final RogueTalentInfoOuterClass.RogueTalentInfo value) {
      bitField0_ |= 0x00000002;
      talentInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetRogueTalentInfoScRsp copyFrom(final GetRogueTalentInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        talentInfo.copyFrom(other.talentInfo);
      }
      return this;
    }

    @Override
    public GetRogueTalentInfoScRsp mergeFrom(final GetRogueTalentInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTalentInfo()) {
        getMutableTalentInfo().mergeFrom(other.talentInfo);
      }
      return this;
    }

    @Override
    public GetRogueTalentInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      talentInfo.clear();
      return this;
    }

    @Override
    public GetRogueTalentInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      talentInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetRogueTalentInfoScRsp)) {
        return false;
      }
      GetRogueTalentInfoScRsp other = (GetRogueTalentInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTalentInfo() || talentInfo.equals(other.talentInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(talentInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(talentInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetRogueTalentInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // talentInfo
            input.readMessage(talentInfo);
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
        output.writeMessage(FieldNames.talentInfo, talentInfo);
      }
      output.endObject();
    }

    @Override
    public GetRogueTalentInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1396978618:
          case 376840225: {
            if (input.isAtField(FieldNames.talentInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(talentInfo);
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
    public GetRogueTalentInfoScRsp clone() {
      return new GetRogueTalentInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetRogueTalentInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetRogueTalentInfoScRsp(), data).checkInitialized();
    }

    public static GetRogueTalentInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRogueTalentInfoScRsp(), input).checkInitialized();
    }

    public static GetRogueTalentInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRogueTalentInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetRogueTalentInfoScRsp messages
     */
    public static MessageFactory<GetRogueTalentInfoScRsp> getFactory() {
      return GetRogueTalentInfoScRspFactory.INSTANCE;
    }

    private enum GetRogueTalentInfoScRspFactory implements MessageFactory<GetRogueTalentInfoScRsp> {
      INSTANCE;

      @Override
      public GetRogueTalentInfoScRsp create() {
        return GetRogueTalentInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName talentInfo = FieldName.forField("talentInfo", "talent_info");
    }
  }
}
