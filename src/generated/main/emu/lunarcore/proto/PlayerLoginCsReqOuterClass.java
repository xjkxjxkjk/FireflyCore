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

public final class PlayerLoginCsReqOuterClass {
  /**
   * Protobuf type {@code PlayerLoginCsReq}
   */
  public static final class PlayerLoginCsReq extends ProtoMessage<PlayerLoginCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  string CMFNBBAJNHB = 8;
     *  string IPCPPKNKJNB = 10;
     *  string DAIBJNAHNFJ = 13;
     *  string DLEGEAIGABF = 4;
     *  uint32 LGJOFBFJNFJ = 1687;
     *  string CANJPBPLPEJ = 12;
     *  string NJFONABELFI = 5;
     *  string DICMJNOAHJC = 188;
     *  string KPNADFKMFBG = 2;
     *  string IHJHMHIIIOB = 155;
     *  string ACEINGOPHMG = 940;
     *  string GIKHEBAEPAD = 11;
     *  uint32 MKCCLNEENEC = 15;
     *  uint32 NALHKEDFJNJ = 1;
     *  string NKCONLNPGLM = 138;
     *  ExtraDeviceInfo OBPAMOECFHG = 885;
     *  string OJFDEFPFNCF = 6;
     *  uint32 BLOFGANMIAH = 1630;
     *  string IAJBIMACPNC = 2038;
     *  string BCDPCNLLEOA = 14;
     *  bool FEELDACNNAG = 801;
     * </pre>
     *
     * <code>optional uint64 login_random = 9;</code>
     */
    private long loginRandom;

    /**
     * <code>optional .PlatformType platform_type = 3;</code>
     */
    private int platformType;

    /**
     * <pre>
     *  PHLNJIOIFKD
     * </pre>
     *
     * <code>optional .LanguageType language = 7;</code>
     */
    private int language;

    private PlayerLoginCsReq() {
    }

    /**
     * @return a new empty instance of {@code PlayerLoginCsReq}
     */
    public static PlayerLoginCsReq newInstance() {
      return new PlayerLoginCsReq();
    }

    /**
     * <pre>
     *  string CMFNBBAJNHB = 8;
     *  string IPCPPKNKJNB = 10;
     *  string DAIBJNAHNFJ = 13;
     *  string DLEGEAIGABF = 4;
     *  uint32 LGJOFBFJNFJ = 1687;
     *  string CANJPBPLPEJ = 12;
     *  string NJFONABELFI = 5;
     *  string DICMJNOAHJC = 188;
     *  string KPNADFKMFBG = 2;
     *  string IHJHMHIIIOB = 155;
     *  string ACEINGOPHMG = 940;
     *  string GIKHEBAEPAD = 11;
     *  uint32 MKCCLNEENEC = 15;
     *  uint32 NALHKEDFJNJ = 1;
     *  string NKCONLNPGLM = 138;
     *  ExtraDeviceInfo OBPAMOECFHG = 885;
     *  string OJFDEFPFNCF = 6;
     *  uint32 BLOFGANMIAH = 1630;
     *  string IAJBIMACPNC = 2038;
     *  string BCDPCNLLEOA = 14;
     *  bool FEELDACNNAG = 801;
     * </pre>
     *
     * <code>optional uint64 login_random = 9;</code>
     * @return whether the loginRandom field is set
     */
    public boolean hasLoginRandom() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  string CMFNBBAJNHB = 8;
     *  string IPCPPKNKJNB = 10;
     *  string DAIBJNAHNFJ = 13;
     *  string DLEGEAIGABF = 4;
     *  uint32 LGJOFBFJNFJ = 1687;
     *  string CANJPBPLPEJ = 12;
     *  string NJFONABELFI = 5;
     *  string DICMJNOAHJC = 188;
     *  string KPNADFKMFBG = 2;
     *  string IHJHMHIIIOB = 155;
     *  string ACEINGOPHMG = 940;
     *  string GIKHEBAEPAD = 11;
     *  uint32 MKCCLNEENEC = 15;
     *  uint32 NALHKEDFJNJ = 1;
     *  string NKCONLNPGLM = 138;
     *  ExtraDeviceInfo OBPAMOECFHG = 885;
     *  string OJFDEFPFNCF = 6;
     *  uint32 BLOFGANMIAH = 1630;
     *  string IAJBIMACPNC = 2038;
     *  string BCDPCNLLEOA = 14;
     *  bool FEELDACNNAG = 801;
     * </pre>
     *
     * <code>optional uint64 login_random = 9;</code>
     * @return this
     */
    public PlayerLoginCsReq clearLoginRandom() {
      bitField0_ &= ~0x00000001;
      loginRandom = 0L;
      return this;
    }

    /**
     * <pre>
     *  string CMFNBBAJNHB = 8;
     *  string IPCPPKNKJNB = 10;
     *  string DAIBJNAHNFJ = 13;
     *  string DLEGEAIGABF = 4;
     *  uint32 LGJOFBFJNFJ = 1687;
     *  string CANJPBPLPEJ = 12;
     *  string NJFONABELFI = 5;
     *  string DICMJNOAHJC = 188;
     *  string KPNADFKMFBG = 2;
     *  string IHJHMHIIIOB = 155;
     *  string ACEINGOPHMG = 940;
     *  string GIKHEBAEPAD = 11;
     *  uint32 MKCCLNEENEC = 15;
     *  uint32 NALHKEDFJNJ = 1;
     *  string NKCONLNPGLM = 138;
     *  ExtraDeviceInfo OBPAMOECFHG = 885;
     *  string OJFDEFPFNCF = 6;
     *  uint32 BLOFGANMIAH = 1630;
     *  string IAJBIMACPNC = 2038;
     *  string BCDPCNLLEOA = 14;
     *  bool FEELDACNNAG = 801;
     * </pre>
     *
     * <code>optional uint64 login_random = 9;</code>
     * @return the loginRandom
     */
    public long getLoginRandom() {
      return loginRandom;
    }

    /**
     * <pre>
     *  string CMFNBBAJNHB = 8;
     *  string IPCPPKNKJNB = 10;
     *  string DAIBJNAHNFJ = 13;
     *  string DLEGEAIGABF = 4;
     *  uint32 LGJOFBFJNFJ = 1687;
     *  string CANJPBPLPEJ = 12;
     *  string NJFONABELFI = 5;
     *  string DICMJNOAHJC = 188;
     *  string KPNADFKMFBG = 2;
     *  string IHJHMHIIIOB = 155;
     *  string ACEINGOPHMG = 940;
     *  string GIKHEBAEPAD = 11;
     *  uint32 MKCCLNEENEC = 15;
     *  uint32 NALHKEDFJNJ = 1;
     *  string NKCONLNPGLM = 138;
     *  ExtraDeviceInfo OBPAMOECFHG = 885;
     *  string OJFDEFPFNCF = 6;
     *  uint32 BLOFGANMIAH = 1630;
     *  string IAJBIMACPNC = 2038;
     *  string BCDPCNLLEOA = 14;
     *  bool FEELDACNNAG = 801;
     * </pre>
     *
     * <code>optional uint64 login_random = 9;</code>
     * @param value the loginRandom to set
     * @return this
     */
    public PlayerLoginCsReq setLoginRandom(final long value) {
      bitField0_ |= 0x00000001;
      loginRandom = value;
      return this;
    }

    /**
     * <code>optional .PlatformType platform_type = 3;</code>
     * @return whether the platformType field is set
     */
    public boolean hasPlatformType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .PlatformType platform_type = 3;</code>
     * @return this
     */
    public PlayerLoginCsReq clearPlatformType() {
      bitField0_ &= ~0x00000002;
      platformType = 0;
      return this;
    }

    /**
     * <code>optional .PlatformType platform_type = 3;</code>
     * @return the platformType
     */
    public PlatformTypeOuterClass.PlatformType getPlatformType() {
      return PlatformTypeOuterClass.PlatformType.forNumber(platformType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link PlayerLoginCsReq#getPlatformType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getPlatformTypeValue() {
      return platformType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link PlatformTypeOuterClass.PlatformType}. Setting an invalid value
     * can cause {@link PlayerLoginCsReq#getPlatformType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public PlayerLoginCsReq setPlatformTypeValue(final int value) {
      bitField0_ |= 0x00000002;
      platformType = value;
      return this;
    }

    /**
     * <code>optional .PlatformType platform_type = 3;</code>
     * @param value the platformType to set
     * @return this
     */
    public PlayerLoginCsReq setPlatformType(final PlatformTypeOuterClass.PlatformType value) {
      bitField0_ |= 0x00000002;
      platformType = value.getNumber();
      return this;
    }

    /**
     * <pre>
     *  PHLNJIOIFKD
     * </pre>
     *
     * <code>optional .LanguageType language = 7;</code>
     * @return whether the language field is set
     */
    public boolean hasLanguage() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  PHLNJIOIFKD
     * </pre>
     *
     * <code>optional .LanguageType language = 7;</code>
     * @return this
     */
    public PlayerLoginCsReq clearLanguage() {
      bitField0_ &= ~0x00000004;
      language = 0;
      return this;
    }

    /**
     * <pre>
     *  PHLNJIOIFKD
     * </pre>
     *
     * <code>optional .LanguageType language = 7;</code>
     * @return the language
     */
    public LanguageTypeOuterClass.LanguageType getLanguage() {
      return LanguageTypeOuterClass.LanguageType.forNumber(language);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link PlayerLoginCsReq#getLanguage()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getLanguageValue() {
      return language;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link LanguageTypeOuterClass.LanguageType}. Setting an invalid value
     * can cause {@link PlayerLoginCsReq#getLanguage()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public PlayerLoginCsReq setLanguageValue(final int value) {
      bitField0_ |= 0x00000004;
      language = value;
      return this;
    }

    /**
     * <pre>
     *  PHLNJIOIFKD
     * </pre>
     *
     * <code>optional .LanguageType language = 7;</code>
     * @param value the language to set
     * @return this
     */
    public PlayerLoginCsReq setLanguage(final LanguageTypeOuterClass.LanguageType value) {
      bitField0_ |= 0x00000004;
      language = value.getNumber();
      return this;
    }

    @Override
    public PlayerLoginCsReq copyFrom(final PlayerLoginCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        loginRandom = other.loginRandom;
        platformType = other.platformType;
        language = other.language;
      }
      return this;
    }

    @Override
    public PlayerLoginCsReq mergeFrom(final PlayerLoginCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLoginRandom()) {
        setLoginRandom(other.loginRandom);
      }
      if (other.hasPlatformType()) {
        setPlatformTypeValue(other.platformType);
      }
      if (other.hasLanguage()) {
        setLanguageValue(other.language);
      }
      return this;
    }

    @Override
    public PlayerLoginCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      loginRandom = 0L;
      platformType = 0;
      language = 0;
      return this;
    }

    @Override
    public PlayerLoginCsReq clearQuick() {
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
      if (!(o instanceof PlayerLoginCsReq)) {
        return false;
      }
      PlayerLoginCsReq other = (PlayerLoginCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasLoginRandom() || loginRandom == other.loginRandom)
        && (!hasPlatformType() || platformType == other.platformType)
        && (!hasLanguage() || language == other.language);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt64NoTag(loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeEnumNoTag(platformType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 56);
        output.writeEnumNoTag(language);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(platformType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(language);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerLoginCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // loginRandom
            loginRandom = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // platformType
            final int value = input.readInt32();
            if (PlatformTypeOuterClass.PlatformType.forNumber(value) != null) {
              platformType = value;
              bitField0_ |= 0x00000002;
            }
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // language
            final int value = input.readInt32();
            if (LanguageTypeOuterClass.LanguageType.forNumber(value) != null) {
              language = value;
              bitField0_ |= 0x00000004;
            }
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
        output.writeUInt64(FieldNames.loginRandom, loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.platformType, platformType, PlatformTypeOuterClass.PlatformType.converter());
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.language, language, LanguageTypeOuterClass.LanguageType.converter());
      }
      output.endObject();
    }

    @Override
    public PlayerLoginCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1268567436:
          case -201491879: {
            if (input.isAtField(FieldNames.loginRandom)) {
              if (!input.trySkipNullValue()) {
                loginRandom = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 155581005:
          case 538062726: {
            if (input.isAtField(FieldNames.platformType)) {
              if (!input.trySkipNullValue()) {
                final PlatformTypeOuterClass.PlatformType value = input.readEnum(PlatformTypeOuterClass.PlatformType.converter());
                if (value != null) {
                  platformType = value.getNumber();
                  bitField0_ |= 0x00000002;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1613589672: {
            if (input.isAtField(FieldNames.language)) {
              if (!input.trySkipNullValue()) {
                final LanguageTypeOuterClass.LanguageType value = input.readEnum(LanguageTypeOuterClass.LanguageType.converter());
                if (value != null) {
                  language = value.getNumber();
                  bitField0_ |= 0x00000004;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public PlayerLoginCsReq clone() {
      return new PlayerLoginCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerLoginCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerLoginCsReq(), data).checkInitialized();
    }

    public static PlayerLoginCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerLoginCsReq(), input).checkInitialized();
    }

    public static PlayerLoginCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerLoginCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerLoginCsReq messages
     */
    public static MessageFactory<PlayerLoginCsReq> getFactory() {
      return PlayerLoginCsReqFactory.INSTANCE;
    }

    private enum PlayerLoginCsReqFactory implements MessageFactory<PlayerLoginCsReq> {
      INSTANCE;

      @Override
      public PlayerLoginCsReq create() {
        return PlayerLoginCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName loginRandom = FieldName.forField("loginRandom", "login_random");

      static final FieldName platformType = FieldName.forField("platformType", "platform_type");

      static final FieldName language = FieldName.forField("language");
    }
  }
}