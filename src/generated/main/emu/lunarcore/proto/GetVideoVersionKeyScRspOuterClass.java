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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetVideoVersionKeyScRspOuterClass {
  /**
   * Protobuf type {@code GetVideoVersionKeyScRsp}
   */
  public static final class GetVideoVersionKeyScRsp extends ProtoMessage<GetVideoVersionKeyScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 9;</code>
     */
    private int retcode;

    /**
     * <code>repeated .VideoKeyInfo LDMLMKHLKHO = 5;</code>
     */
    private final RepeatedMessage<VideoKeyInfoOuterClass.VideoKeyInfo> lDMLMKHLKHO = RepeatedMessage.newEmptyInstance(VideoKeyInfoOuterClass.VideoKeyInfo.getFactory());

    /**
     * <code>repeated .VideoKeyInfo PGKFFNFCHIG = 14;</code>
     */
    private final RepeatedMessage<VideoKeyInfoOuterClass.VideoKeyInfo> pGKFFNFCHIG = RepeatedMessage.newEmptyInstance(VideoKeyInfoOuterClass.VideoKeyInfo.getFactory());

    private GetVideoVersionKeyScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetVideoVersionKeyScRsp}
     */
    public static GetVideoVersionKeyScRsp newInstance() {
      return new GetVideoVersionKeyScRsp();
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return this
     */
    public GetVideoVersionKeyScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetVideoVersionKeyScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .VideoKeyInfo LDMLMKHLKHO = 5;</code>
     * @return whether the lDMLMKHLKHO field is set
     */
    public boolean hasLDMLMKHLKHO() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .VideoKeyInfo LDMLMKHLKHO = 5;</code>
     * @return this
     */
    public GetVideoVersionKeyScRsp clearLDMLMKHLKHO() {
      bitField0_ &= ~0x00000002;
      lDMLMKHLKHO.clear();
      return this;
    }

    /**
     * <code>repeated .VideoKeyInfo LDMLMKHLKHO = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLDMLMKHLKHO()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<VideoKeyInfoOuterClass.VideoKeyInfo> getLDMLMKHLKHO() {
      return lDMLMKHLKHO;
    }

    /**
     * <code>repeated .VideoKeyInfo LDMLMKHLKHO = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<VideoKeyInfoOuterClass.VideoKeyInfo> getMutableLDMLMKHLKHO() {
      bitField0_ |= 0x00000002;
      return lDMLMKHLKHO;
    }

    /**
     * <code>repeated .VideoKeyInfo LDMLMKHLKHO = 5;</code>
     * @param value the lDMLMKHLKHO to add
     * @return this
     */
    public GetVideoVersionKeyScRsp addLDMLMKHLKHO(final VideoKeyInfoOuterClass.VideoKeyInfo value) {
      bitField0_ |= 0x00000002;
      lDMLMKHLKHO.add(value);
      return this;
    }

    /**
     * <code>repeated .VideoKeyInfo LDMLMKHLKHO = 5;</code>
     * @param values the lDMLMKHLKHO to add
     * @return this
     */
    public GetVideoVersionKeyScRsp addAllLDMLMKHLKHO(
        final VideoKeyInfoOuterClass.VideoKeyInfo... values) {
      bitField0_ |= 0x00000002;
      lDMLMKHLKHO.addAll(values);
      return this;
    }

    /**
     * <code>repeated .VideoKeyInfo PGKFFNFCHIG = 14;</code>
     * @return whether the pGKFFNFCHIG field is set
     */
    public boolean hasPGKFFNFCHIG() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .VideoKeyInfo PGKFFNFCHIG = 14;</code>
     * @return this
     */
    public GetVideoVersionKeyScRsp clearPGKFFNFCHIG() {
      bitField0_ &= ~0x00000004;
      pGKFFNFCHIG.clear();
      return this;
    }

    /**
     * <code>repeated .VideoKeyInfo PGKFFNFCHIG = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePGKFFNFCHIG()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<VideoKeyInfoOuterClass.VideoKeyInfo> getPGKFFNFCHIG() {
      return pGKFFNFCHIG;
    }

    /**
     * <code>repeated .VideoKeyInfo PGKFFNFCHIG = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<VideoKeyInfoOuterClass.VideoKeyInfo> getMutablePGKFFNFCHIG() {
      bitField0_ |= 0x00000004;
      return pGKFFNFCHIG;
    }

    /**
     * <code>repeated .VideoKeyInfo PGKFFNFCHIG = 14;</code>
     * @param value the pGKFFNFCHIG to add
     * @return this
     */
    public GetVideoVersionKeyScRsp addPGKFFNFCHIG(final VideoKeyInfoOuterClass.VideoKeyInfo value) {
      bitField0_ |= 0x00000004;
      pGKFFNFCHIG.add(value);
      return this;
    }

    /**
     * <code>repeated .VideoKeyInfo PGKFFNFCHIG = 14;</code>
     * @param values the pGKFFNFCHIG to add
     * @return this
     */
    public GetVideoVersionKeyScRsp addAllPGKFFNFCHIG(
        final VideoKeyInfoOuterClass.VideoKeyInfo... values) {
      bitField0_ |= 0x00000004;
      pGKFFNFCHIG.addAll(values);
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp copyFrom(final GetVideoVersionKeyScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        lDMLMKHLKHO.copyFrom(other.lDMLMKHLKHO);
        pGKFFNFCHIG.copyFrom(other.pGKFFNFCHIG);
      }
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp mergeFrom(final GetVideoVersionKeyScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasLDMLMKHLKHO()) {
        getMutableLDMLMKHLKHO().addAll(other.lDMLMKHLKHO);
      }
      if (other.hasPGKFFNFCHIG()) {
        getMutablePGKFFNFCHIG().addAll(other.pGKFFNFCHIG);
      }
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      lDMLMKHLKHO.clear();
      pGKFFNFCHIG.clear();
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lDMLMKHLKHO.clearQuick();
      pGKFFNFCHIG.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetVideoVersionKeyScRsp)) {
        return false;
      }
      GetVideoVersionKeyScRsp other = (GetVideoVersionKeyScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasLDMLMKHLKHO() || lDMLMKHLKHO.equals(other.lDMLMKHLKHO))
        && (!hasPGKFFNFCHIG() || pGKFFNFCHIG.equals(other.pGKFFNFCHIG));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < lDMLMKHLKHO.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(lDMLMKHLKHO.get(i));
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < pGKFFNFCHIG.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(pGKFFNFCHIG.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * lDMLMKHLKHO.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(lDMLMKHLKHO);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * pGKFFNFCHIG.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(pGKFFNFCHIG);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetVideoVersionKeyScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // lDMLMKHLKHO
            tag = input.readRepeatedMessage(lDMLMKHLKHO, tag);
            bitField0_ |= 0x00000002;
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // pGKFFNFCHIG
            tag = input.readRepeatedMessage(pGKFFNFCHIG, tag);
            bitField0_ |= 0x00000004;
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
        output.writeRepeatedMessage(FieldNames.lDMLMKHLKHO, lDMLMKHLKHO);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.pGKFFNFCHIG, pGKFFNFCHIG);
      }
      output.endObject();
    }

    @Override
    public GetVideoVersionKeyScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -198482119: {
            if (input.isAtField(FieldNames.lDMLMKHLKHO)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(lDMLMKHLKHO);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 528298991: {
            if (input.isAtField(FieldNames.pGKFFNFCHIG)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(pGKFFNFCHIG);
                bitField0_ |= 0x00000004;
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
    public GetVideoVersionKeyScRsp clone() {
      return new GetVideoVersionKeyScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetVideoVersionKeyScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyScRsp(), data).checkInitialized();
    }

    public static GetVideoVersionKeyScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyScRsp(), input).checkInitialized();
    }

    public static GetVideoVersionKeyScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetVideoVersionKeyScRsp messages
     */
    public static MessageFactory<GetVideoVersionKeyScRsp> getFactory() {
      return GetVideoVersionKeyScRspFactory.INSTANCE;
    }

    private enum GetVideoVersionKeyScRspFactory implements MessageFactory<GetVideoVersionKeyScRsp> {
      INSTANCE;

      @Override
      public GetVideoVersionKeyScRsp create() {
        return GetVideoVersionKeyScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName lDMLMKHLKHO = FieldName.forField("LDMLMKHLKHO");

      static final FieldName pGKFFNFCHIG = FieldName.forField("PGKFFNFCHIG");
    }
  }
}