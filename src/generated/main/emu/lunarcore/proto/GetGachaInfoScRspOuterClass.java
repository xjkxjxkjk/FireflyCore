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

public final class GetGachaInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetGachaInfoScRsp}
   */
  public static final class GetGachaInfoScRsp extends ProtoMessage<GetGachaInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 gacha_random = 2;</code>
     */
    private int gachaRandom;

    /**
     * <code>optional uint32 GHJDKHPBGNN = 6;</code>
     */
    private int gHJDKHPBGNN;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 FMMILADAHFF = 12;</code>
     */
    private int fMMILADAHFF;

    /**
     * <code>optional uint32 ECKOEHMHJBM = 15;</code>
     */
    private int eCKOEHMHJBM;

    /**
     * <code>repeated .GachaInfo gacha_info_list = 3;</code>
     */
    private final RepeatedMessage<GachaInfoOuterClass.GachaInfo> gachaInfoList = RepeatedMessage.newEmptyInstance(GachaInfoOuterClass.GachaInfo.getFactory());

    private GetGachaInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetGachaInfoScRsp}
     */
    public static GetGachaInfoScRsp newInstance() {
      return new GetGachaInfoScRsp();
    }

    /**
     * <code>optional uint32 gacha_random = 2;</code>
     * @return whether the gachaRandom field is set
     */
    public boolean hasGachaRandom() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 gacha_random = 2;</code>
     * @return this
     */
    public GetGachaInfoScRsp clearGachaRandom() {
      bitField0_ &= ~0x00000001;
      gachaRandom = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_random = 2;</code>
     * @return the gachaRandom
     */
    public int getGachaRandom() {
      return gachaRandom;
    }

    /**
     * <code>optional uint32 gacha_random = 2;</code>
     * @param value the gachaRandom to set
     * @return this
     */
    public GetGachaInfoScRsp setGachaRandom(final int value) {
      bitField0_ |= 0x00000001;
      gachaRandom = value;
      return this;
    }

    /**
     * <code>optional uint32 GHJDKHPBGNN = 6;</code>
     * @return whether the gHJDKHPBGNN field is set
     */
    public boolean hasGHJDKHPBGNN() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 GHJDKHPBGNN = 6;</code>
     * @return this
     */
    public GetGachaInfoScRsp clearGHJDKHPBGNN() {
      bitField0_ &= ~0x00000002;
      gHJDKHPBGNN = 0;
      return this;
    }

    /**
     * <code>optional uint32 GHJDKHPBGNN = 6;</code>
     * @return the gHJDKHPBGNN
     */
    public int getGHJDKHPBGNN() {
      return gHJDKHPBGNN;
    }

    /**
     * <code>optional uint32 GHJDKHPBGNN = 6;</code>
     * @param value the gHJDKHPBGNN to set
     * @return this
     */
    public GetGachaInfoScRsp setGHJDKHPBGNN(final int value) {
      bitField0_ |= 0x00000002;
      gHJDKHPBGNN = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public GetGachaInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetGachaInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 FMMILADAHFF = 12;</code>
     * @return whether the fMMILADAHFF field is set
     */
    public boolean hasFMMILADAHFF() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 FMMILADAHFF = 12;</code>
     * @return this
     */
    public GetGachaInfoScRsp clearFMMILADAHFF() {
      bitField0_ &= ~0x00000008;
      fMMILADAHFF = 0;
      return this;
    }

    /**
     * <code>optional uint32 FMMILADAHFF = 12;</code>
     * @return the fMMILADAHFF
     */
    public int getFMMILADAHFF() {
      return fMMILADAHFF;
    }

    /**
     * <code>optional uint32 FMMILADAHFF = 12;</code>
     * @param value the fMMILADAHFF to set
     * @return this
     */
    public GetGachaInfoScRsp setFMMILADAHFF(final int value) {
      bitField0_ |= 0x00000008;
      fMMILADAHFF = value;
      return this;
    }

    /**
     * <code>optional uint32 ECKOEHMHJBM = 15;</code>
     * @return whether the eCKOEHMHJBM field is set
     */
    public boolean hasECKOEHMHJBM() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 ECKOEHMHJBM = 15;</code>
     * @return this
     */
    public GetGachaInfoScRsp clearECKOEHMHJBM() {
      bitField0_ &= ~0x00000010;
      eCKOEHMHJBM = 0;
      return this;
    }

    /**
     * <code>optional uint32 ECKOEHMHJBM = 15;</code>
     * @return the eCKOEHMHJBM
     */
    public int getECKOEHMHJBM() {
      return eCKOEHMHJBM;
    }

    /**
     * <code>optional uint32 ECKOEHMHJBM = 15;</code>
     * @param value the eCKOEHMHJBM to set
     * @return this
     */
    public GetGachaInfoScRsp setECKOEHMHJBM(final int value) {
      bitField0_ |= 0x00000010;
      eCKOEHMHJBM = value;
      return this;
    }

    /**
     * <code>repeated .GachaInfo gacha_info_list = 3;</code>
     * @return whether the gachaInfoList field is set
     */
    public boolean hasGachaInfoList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .GachaInfo gacha_info_list = 3;</code>
     * @return this
     */
    public GetGachaInfoScRsp clearGachaInfoList() {
      bitField0_ &= ~0x00000020;
      gachaInfoList.clear();
      return this;
    }

    /**
     * <code>repeated .GachaInfo gacha_info_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGachaInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<GachaInfoOuterClass.GachaInfo> getGachaInfoList() {
      return gachaInfoList;
    }

    /**
     * <code>repeated .GachaInfo gacha_info_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<GachaInfoOuterClass.GachaInfo> getMutableGachaInfoList() {
      bitField0_ |= 0x00000020;
      return gachaInfoList;
    }

    /**
     * <code>repeated .GachaInfo gacha_info_list = 3;</code>
     * @param value the gachaInfoList to add
     * @return this
     */
    public GetGachaInfoScRsp addGachaInfoList(final GachaInfoOuterClass.GachaInfo value) {
      bitField0_ |= 0x00000020;
      gachaInfoList.add(value);
      return this;
    }

    /**
     * <code>repeated .GachaInfo gacha_info_list = 3;</code>
     * @param values the gachaInfoList to add
     * @return this
     */
    public GetGachaInfoScRsp addAllGachaInfoList(final GachaInfoOuterClass.GachaInfo... values) {
      bitField0_ |= 0x00000020;
      gachaInfoList.addAll(values);
      return this;
    }

    @Override
    public GetGachaInfoScRsp copyFrom(final GetGachaInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gachaRandom = other.gachaRandom;
        gHJDKHPBGNN = other.gHJDKHPBGNN;
        retcode = other.retcode;
        fMMILADAHFF = other.fMMILADAHFF;
        eCKOEHMHJBM = other.eCKOEHMHJBM;
        gachaInfoList.copyFrom(other.gachaInfoList);
      }
      return this;
    }

    @Override
    public GetGachaInfoScRsp mergeFrom(final GetGachaInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGachaRandom()) {
        setGachaRandom(other.gachaRandom);
      }
      if (other.hasGHJDKHPBGNN()) {
        setGHJDKHPBGNN(other.gHJDKHPBGNN);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasFMMILADAHFF()) {
        setFMMILADAHFF(other.fMMILADAHFF);
      }
      if (other.hasECKOEHMHJBM()) {
        setECKOEHMHJBM(other.eCKOEHMHJBM);
      }
      if (other.hasGachaInfoList()) {
        getMutableGachaInfoList().addAll(other.gachaInfoList);
      }
      return this;
    }

    @Override
    public GetGachaInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaRandom = 0;
      gHJDKHPBGNN = 0;
      retcode = 0;
      fMMILADAHFF = 0;
      eCKOEHMHJBM = 0;
      gachaInfoList.clear();
      return this;
    }

    @Override
    public GetGachaInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaInfoList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetGachaInfoScRsp)) {
        return false;
      }
      GetGachaInfoScRsp other = (GetGachaInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasGachaRandom() || gachaRandom == other.gachaRandom)
        && (!hasGHJDKHPBGNN() || gHJDKHPBGNN == other.gHJDKHPBGNN)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasFMMILADAHFF() || fMMILADAHFF == other.fMMILADAHFF)
        && (!hasECKOEHMHJBM() || eCKOEHMHJBM == other.eCKOEHMHJBM)
        && (!hasGachaInfoList() || gachaInfoList.equals(other.gachaInfoList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(gachaRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(gHJDKHPBGNN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(fMMILADAHFF);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(eCKOEHMHJBM);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < gachaInfoList.length(); i++) {
          output.writeRawByte((byte) 26);
          output.writeMessageNoTag(gachaInfoList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gHJDKHPBGNN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(fMMILADAHFF);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eCKOEHMHJBM);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * gachaInfoList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(gachaInfoList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetGachaInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // gachaRandom
            gachaRandom = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // gHJDKHPBGNN
            gHJDKHPBGNN = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // fMMILADAHFF
            fMMILADAHFF = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // eCKOEHMHJBM
            eCKOEHMHJBM = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // gachaInfoList
            tag = input.readRepeatedMessage(gachaInfoList, tag);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.gachaRandom, gachaRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.gHJDKHPBGNN, gHJDKHPBGNN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.fMMILADAHFF, fMMILADAHFF);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.eCKOEHMHJBM, eCKOEHMHJBM);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.gachaInfoList, gachaInfoList);
      }
      output.endObject();
    }

    @Override
    public GetGachaInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1635961627:
          case -47579616: {
            if (input.isAtField(FieldNames.gachaRandom)) {
              if (!input.trySkipNullValue()) {
                gachaRandom = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1921260445: {
            if (input.isAtField(FieldNames.gHJDKHPBGNN)) {
              if (!input.trySkipNullValue()) {
                gHJDKHPBGNN = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1886613741: {
            if (input.isAtField(FieldNames.fMMILADAHFF)) {
              if (!input.trySkipNullValue()) {
                fMMILADAHFF = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1353709333: {
            if (input.isAtField(FieldNames.eCKOEHMHJBM)) {
              if (!input.trySkipNullValue()) {
                eCKOEHMHJBM = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -273788402:
          case 1953910546: {
            if (input.isAtField(FieldNames.gachaInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(gachaInfoList);
                bitField0_ |= 0x00000020;
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
    public GetGachaInfoScRsp clone() {
      return new GetGachaInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetGachaInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetGachaInfoScRsp(), data).checkInitialized();
    }

    public static GetGachaInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetGachaInfoScRsp(), input).checkInitialized();
    }

    public static GetGachaInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetGachaInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetGachaInfoScRsp messages
     */
    public static MessageFactory<GetGachaInfoScRsp> getFactory() {
      return GetGachaInfoScRspFactory.INSTANCE;
    }

    private enum GetGachaInfoScRspFactory implements MessageFactory<GetGachaInfoScRsp> {
      INSTANCE;

      @Override
      public GetGachaInfoScRsp create() {
        return GetGachaInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gachaRandom = FieldName.forField("gachaRandom", "gacha_random");

      static final FieldName gHJDKHPBGNN = FieldName.forField("GHJDKHPBGNN");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName fMMILADAHFF = FieldName.forField("FMMILADAHFF");

      static final FieldName eCKOEHMHJBM = FieldName.forField("ECKOEHMHJBM");

      static final FieldName gachaInfoList = FieldName.forField("gachaInfoList", "gacha_info_list");
    }
  }
}
