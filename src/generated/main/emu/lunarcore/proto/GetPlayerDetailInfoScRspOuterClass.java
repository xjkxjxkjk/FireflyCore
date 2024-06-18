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

public final class GetPlayerDetailInfoScRspOuterClass {
  /**
   * <pre>
   *  Jlfjneleoan
   * </pre>
   *
   * Protobuf type {@code GetPlayerDetailInfoScRsp}
   */
  public static final class GetPlayerDetailInfoScRsp extends ProtoMessage<GetPlayerDetailInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 5;</code>
     */
    private int retcode;

    /**
     * <pre>
     * knmbdmpogkc
     * </pre>
     *
     * <code>optional .PlayerDetailInfo player_detail_info = 8;</code>
     */
    private final PlayerDetailInfoOuterClass.PlayerDetailInfo playerDetailInfo = PlayerDetailInfoOuterClass.PlayerDetailInfo.newInstance();

    private GetPlayerDetailInfoScRsp() {
    }

    /**
     * <pre>
     *  Jlfjneleoan
     * </pre>
     *
     * @return a new empty instance of {@code GetPlayerDetailInfoScRsp}
     */
    public static GetPlayerDetailInfoScRsp newInstance() {
      return new GetPlayerDetailInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return this
     */
    public GetPlayerDetailInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetPlayerDetailInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * knmbdmpogkc
     * </pre>
     *
     * <code>optional .PlayerDetailInfo player_detail_info = 8;</code>
     * @return whether the playerDetailInfo field is set
     */
    public boolean hasPlayerDetailInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * knmbdmpogkc
     * </pre>
     *
     * <code>optional .PlayerDetailInfo player_detail_info = 8;</code>
     * @return this
     */
    public GetPlayerDetailInfoScRsp clearPlayerDetailInfo() {
      bitField0_ &= ~0x00000002;
      playerDetailInfo.clear();
      return this;
    }

    /**
     * <pre>
     * knmbdmpogkc
     * </pre>
     *
     * <code>optional .PlayerDetailInfo player_detail_info = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePlayerDetailInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PlayerDetailInfoOuterClass.PlayerDetailInfo getPlayerDetailInfo() {
      return playerDetailInfo;
    }

    /**
     * <pre>
     * knmbdmpogkc
     * </pre>
     *
     * <code>optional .PlayerDetailInfo player_detail_info = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PlayerDetailInfoOuterClass.PlayerDetailInfo getMutablePlayerDetailInfo() {
      bitField0_ |= 0x00000002;
      return playerDetailInfo;
    }

    /**
     * <pre>
     * knmbdmpogkc
     * </pre>
     *
     * <code>optional .PlayerDetailInfo player_detail_info = 8;</code>
     * @param value the playerDetailInfo to set
     * @return this
     */
    public GetPlayerDetailInfoScRsp setPlayerDetailInfo(
        final PlayerDetailInfoOuterClass.PlayerDetailInfo value) {
      bitField0_ |= 0x00000002;
      playerDetailInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetPlayerDetailInfoScRsp copyFrom(final GetPlayerDetailInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        playerDetailInfo.copyFrom(other.playerDetailInfo);
      }
      return this;
    }

    @Override
    public GetPlayerDetailInfoScRsp mergeFrom(final GetPlayerDetailInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasPlayerDetailInfo()) {
        getMutablePlayerDetailInfo().mergeFrom(other.playerDetailInfo);
      }
      return this;
    }

    @Override
    public GetPlayerDetailInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      playerDetailInfo.clear();
      return this;
    }

    @Override
    public GetPlayerDetailInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      playerDetailInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetPlayerDetailInfoScRsp)) {
        return false;
      }
      GetPlayerDetailInfoScRsp other = (GetPlayerDetailInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasPlayerDetailInfo() || playerDetailInfo.equals(other.playerDetailInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(playerDetailInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(playerDetailInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetPlayerDetailInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // playerDetailInfo
            input.readMessage(playerDetailInfo);
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
        output.writeMessage(FieldNames.playerDetailInfo, playerDetailInfo);
      }
      output.endObject();
    }

    @Override
    public GetPlayerDetailInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 2035249760:
          case -1408876674: {
            if (input.isAtField(FieldNames.playerDetailInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(playerDetailInfo);
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
    public GetPlayerDetailInfoScRsp clone() {
      return new GetPlayerDetailInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetPlayerDetailInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetPlayerDetailInfoScRsp(), data).checkInitialized();
    }

    public static GetPlayerDetailInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPlayerDetailInfoScRsp(), input).checkInitialized();
    }

    public static GetPlayerDetailInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPlayerDetailInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetPlayerDetailInfoScRsp messages
     */
    public static MessageFactory<GetPlayerDetailInfoScRsp> getFactory() {
      return GetPlayerDetailInfoScRspFactory.INSTANCE;
    }

    private enum GetPlayerDetailInfoScRspFactory implements MessageFactory<GetPlayerDetailInfoScRsp> {
      INSTANCE;

      @Override
      public GetPlayerDetailInfoScRsp create() {
        return GetPlayerDetailInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName playerDetailInfo = FieldName.forField("playerDetailInfo", "player_detail_info");
    }
  }
}
