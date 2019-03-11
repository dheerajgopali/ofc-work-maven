package org.dheeraj.learning.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "pr_perf_stats", schema = "data", catalog = "development")
public class PrPerfStatsEntity {
    private Timestamp pxcommitdatetime;
    private Timestamp pxsavedatetime;
    private BigDecimal pxactivationdatatimecpu;
    private BigDecimal pxactivationdatatimeelapsed;
    private Integer pxactivitycount;
    private Integer pxalertcount;
    private String pxapplication;
    private String pxcheckout;
    private Integer pxcommitcount;
    private BigDecimal pxcommitelapsed;
    private Integer pxcommitrowcount;
    private Integer pxconnectcount;
    private BigDecimal pxconnectelapsed;
    private Integer pxdbinputbytes;
    private Integer pxdbopexceedingthresholdcount;
    private Integer pxdboutputbytes;
    private Integer pxdeclarativerulereadcount;
    private BigDecimal pxdeclarativerulesinvokedcpu;
    private Integer pxdeclarativerulesinvokedcount;
    private BigDecimal pxdeclarativeruleslookupcpu;
    private Integer pxdeclarativeruleslookupcount;
    private Integer pxdeclexprctxfreeusecount;
    private Integer pxdeclexprctxsensusecount;
    private BigDecimal pxdeclntwksbuildhlelap;
    private BigDecimal pxdeclntwksbuildhlcpu;
    private BigDecimal pxdeclntwksbuildconstelapsed;
    private BigDecimal pxdeclntwksbuildconstcpu;
    private BigDecimal pxdeclrulesinvokedelapsed;
    private Integer pxdeclrulesinvokedbckgrdcnt;
    private BigDecimal pxdeclruleslookupelapsed;
    private BigDecimal pxdecryptcount;
    private BigDecimal pxdecryptcpu;
    private BigDecimal pxdecryptelapsed;
    private String pxencodedrulesets;
    private BigDecimal pxencryptcount;
    private BigDecimal pxencryptcpu;
    private BigDecimal pxencryptelapsed;
    private Integer pxflowcount;
    private Integer pxindexcount;
    private Integer pxinfergeneratedjavacount;
    private BigDecimal pxinfergeneratedjavacpu;
    private BigDecimal pxinfergeneratedjavaelapsed;
    private BigDecimal pxinfergeneratedjavahlelapsed;
    private Integer pxinputbytes;
    private String pxinsname;
    private Integer pxinteractions;
    private BigDecimal pxjavaassemblecpu;
    private Integer pxjavaassemblecount;
    private BigDecimal pxjavaassembleelapsed;
    private BigDecimal pxjavaassemblehlelapsed;
    private BigDecimal pxjavacompilecpu;
    private Integer pxjavacompilecount;
    private BigDecimal pxjavacompileelapsed;
    private BigDecimal pxjavageneratecpu;
    private Integer pxjavageneratecount;
    private BigDecimal pxjavagenerateelapsed;
    private BigDecimal pxjavastepcpu;
    private Integer pxjavastepcount;
    private BigDecimal pxjavastepelapsed;
    private BigDecimal pxjavasyntaxcpu;
    private Integer pxjavasyntaxcount;
    private BigDecimal pxjavasyntaxelapsed;
    private Integer pxlegacyruleapiusedcount;
    private Integer pxlistrowwithfilteredstrmcnt;
    private Integer pxlistrowwithunfilteredstrmcnt;
    private Integer pxlistrowwithoutstreamcount;
    private Integer pxlistwithfilteredstreamcount;
    private Integer pxlistwithunfilteredstrmcnt;
    private Integer pxlistwithoutstreamcount;
    private Integer pxlookuplistdbfetches;
    private Integer pxnewfuainstances;
    private String pxobjclass;
    private BigDecimal pxotherbrowsecpu;
    private BigDecimal pxotherbrowseelapsed;
    private BigDecimal pxotherbrowsefiltercpu;
    private Integer pxotherbrowsefiltercnt;
    private BigDecimal pxotherbrowsefilterelapsed;
    private Integer pxotherbrowsereturned;
    private Integer pxothercount;
    private Integer pxotherfromcachecount;
    private BigDecimal pxotheriocpu;
    private Integer pxotheriocount;
    private BigDecimal pxotherioelapsed;
    private Integer pxoutputbytes;
    private Integer pxparserulecount;
    private BigDecimal pxparseruletime;
    private BigDecimal pxparseruletimecpu;
    private Integer pxpassivationcount;
    private BigDecimal pxpassivationdatatimecpu;
    private BigDecimal pxpassivationdatatimeelapsed;
    private BigDecimal pxpassivationidletimeelapsed;
    private Integer pxpassivationsizeaverage;
    private Integer pxpassivationsizelast;
    private Integer pxpassivationsizepeak;
    private Integer pxproceduralrulereadcount;
    private BigDecimal pxprocesscpu;
    private String pxproclabel;
    private Integer pxpropertyreadcount;
    private Integer pxrdbiocount;
    private BigDecimal pxrdbioelapsed;
    private Integer pxrdbrowwithstreamcount;
    private Integer pxrdbrowwithoutstreamcount;
    private Integer pxrdbwithstreamcount;
    private Integer pxrdbwithoutstreamcount;
    private BigDecimal pxreferencepropertyusecpu;
    private Integer pxreferencepropertyusecount;
    private BigDecimal pxreferencepropertyuseelapsed;
    private String pxrequestorid;
    private Timestamp pxrequestorstart;
    private String pxrequestortype;
    private BigDecimal pxrulebrowsecpu;
    private BigDecimal pxrulebrowseelapsed;
    private BigDecimal pxrulebrowsefiltercpu;
    private Integer pxrulebrowsefiltercnt;
    private BigDecimal pxrulebrowsefilterelapsed;
    private Integer pxrulebrowsereturned;
    private BigDecimal pxrulecpu;
    private Integer pxrulecount;
    private Integer pxrulefromcachecount;
    private BigDecimal pxruleioelapsed;
    private Integer pxrulesexecuted;
    private Integer pxrulesused;
    private Integer pxrunmodelcount;
    private Integer pxrunotherrulecount;
    private Integer pxrunstreamcount;
    private Integer pxrunwhencount;
    private BigDecimal pxsavedcbafterintcount;
    private Integer pxsavedcbafterintcpu;
    private BigDecimal pxsavedcbafterintelapsed;
    private BigDecimal pxsavedcxtafterintcpu;
    private Integer pxsavedcxtafterintcount;
    private BigDecimal pxsavedcxtafterintelapsed;
    private BigDecimal pxserviceactivitycpu;
    private BigDecimal pxserviceactivitytime;
    private Integer pxservicecount;
    private Integer pxservicedatavolume;
    private BigDecimal pxserviceinmapreqcpu;
    private BigDecimal pxserviceinmapreqtime;
    private Integer pxservicenumfilerecords;
    private BigDecimal pxserviceoutmapreqcpu;
    private BigDecimal pxserviceoutmapreqtime;
    private Timestamp pxsnapshottime;
    private String pxsnapshottype;
    private BigDecimal pxstreamtimecpu;
    private BigDecimal pxstreamtimeelapsed;
    private String pxsystemname;
    private String pxsystemnode;
    private String pxsystemnodeid;
    private Timestamp pxsystemstart;
    private BigDecimal pxtotalreqcpu;
    private BigDecimal pxtotalreqtime;
    private Integer pxtrackedpropertychangescount;
    private BigDecimal pxtransientjavaassemblecpu;
    private Integer pxtransientjavaassemblecount;
    private BigDecimal pxtransientjavaassembleelapsed;
    private BigDecimal pxtransientjavacompilecpu;
    private Integer pxtransientjavacompilecount;
    private BigDecimal pxtransientjavacompileelapsed;
    private String pxuseragent;
    private String pyuseridentifier;
    private String pzinskey;
    private BigDecimal pxclientloadelapsed;
    private Integer pxclientloadcount;
    private BigDecimal pxadpcntxtsetuptimecpu;
    private BigDecimal pxadpcntxtsetuptimeelapsed;
    private BigDecimal pxadploadacttimecpu;
    private BigDecimal pxadploadacttimeelapsed;
    private Integer pxadploadsusedcount;
    private BigDecimal pxadppagecopytimecpu;
    private BigDecimal pxadppagecopytimeelapsed;
    private BigDecimal pxadpqueuewaittimecpu;
    private BigDecimal pxadpqueuewaittimeelapsed;
    private BigDecimal pxadpwaittimecpu;
    private BigDecimal pxadpwaittimeelapsed;
    private Integer pxchildreqcount;
    private BigDecimal pxchildwaitelapsed;
    private BigDecimal pxcnctclientresponseelapsed;
    private BigDecimal pxcnctclientresponseelapsedcpu;
    private BigDecimal pxcnctinmapreqelapsed;
    private BigDecimal pxcnctinmapreqcpu;
    private BigDecimal pxcnctoutmapreqcpu;
    private BigDecimal pxcnctoutmapreqelapsed;
    private Integer pxdeclpagecount;
    private Integer pxdeclpageloadcount;
    private BigDecimal pxdeclpageloadcpu;
    private BigDecimal pxdeclpageloadelapsed;
    private BigDecimal pxfuacachedbloadcpu;
    private BigDecimal pxfuacachedbloadelapsed;
    private BigDecimal pxfuawritetodbtimecpu;
    private BigDecimal pxfuawritetodbtimeelapsed;
    private BigDecimal pxinfergeneratedjavahlcpu;
    private BigDecimal pxjavaassemblehlcpu;
    private BigDecimal pxtrackerreporttimecpu;
    private BigDecimal pxtrackerreporttimeelapsed;
    private Integer pxexceptioncount;

    @Basic
    @Column(name = "pxcommitdatetime", nullable = true)
    public Timestamp getPxcommitdatetime() {
        return pxcommitdatetime;
    }

    public void setPxcommitdatetime(Timestamp pxcommitdatetime) {
        this.pxcommitdatetime = pxcommitdatetime;
    }

    @Basic
    @Column(name = "pxsavedatetime", nullable = true)
    public Timestamp getPxsavedatetime() {
        return pxsavedatetime;
    }

    public void setPxsavedatetime(Timestamp pxsavedatetime) {
        this.pxsavedatetime = pxsavedatetime;
    }

    @Basic
    @Column(name = "pxactivationdatatimecpu", nullable = true, precision = 6)
    public BigDecimal getPxactivationdatatimecpu() {
        return pxactivationdatatimecpu;
    }

    public void setPxactivationdatatimecpu(BigDecimal pxactivationdatatimecpu) {
        this.pxactivationdatatimecpu = pxactivationdatatimecpu;
    }

    @Basic
    @Column(name = "pxactivationdatatimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxactivationdatatimeelapsed() {
        return pxactivationdatatimeelapsed;
    }

    public void setPxactivationdatatimeelapsed(BigDecimal pxactivationdatatimeelapsed) {
        this.pxactivationdatatimeelapsed = pxactivationdatatimeelapsed;
    }

    @Basic
    @Column(name = "pxactivitycount", nullable = true, precision = 0)
    public Integer getPxactivitycount() {
        return pxactivitycount;
    }

    public void setPxactivitycount(Integer pxactivitycount) {
        this.pxactivitycount = pxactivitycount;
    }

    @Basic
    @Column(name = "pxalertcount", nullable = true, precision = 0)
    public Integer getPxalertcount() {
        return pxalertcount;
    }

    public void setPxalertcount(Integer pxalertcount) {
        this.pxalertcount = pxalertcount;
    }

    @Basic
    @Column(name = "pxapplication", nullable = true, length = 128)
    public String getPxapplication() {
        return pxapplication;
    }

    public void setPxapplication(String pxapplication) {
        this.pxapplication = pxapplication;
    }

    @Basic
    @Column(name = "pxcheckout", nullable = true, length = 8)
    public String getPxcheckout() {
        return pxcheckout;
    }

    public void setPxcheckout(String pxcheckout) {
        this.pxcheckout = pxcheckout;
    }

    @Basic
    @Column(name = "pxcommitcount", nullable = true, precision = 0)
    public Integer getPxcommitcount() {
        return pxcommitcount;
    }

    public void setPxcommitcount(Integer pxcommitcount) {
        this.pxcommitcount = pxcommitcount;
    }

    @Basic
    @Column(name = "pxcommitelapsed", nullable = true, precision = 6)
    public BigDecimal getPxcommitelapsed() {
        return pxcommitelapsed;
    }

    public void setPxcommitelapsed(BigDecimal pxcommitelapsed) {
        this.pxcommitelapsed = pxcommitelapsed;
    }

    @Basic
    @Column(name = "pxcommitrowcount", nullable = true, precision = 0)
    public Integer getPxcommitrowcount() {
        return pxcommitrowcount;
    }

    public void setPxcommitrowcount(Integer pxcommitrowcount) {
        this.pxcommitrowcount = pxcommitrowcount;
    }

    @Basic
    @Column(name = "pxconnectcount", nullable = true, precision = 0)
    public Integer getPxconnectcount() {
        return pxconnectcount;
    }

    public void setPxconnectcount(Integer pxconnectcount) {
        this.pxconnectcount = pxconnectcount;
    }

    @Basic
    @Column(name = "pxconnectelapsed", nullable = true, precision = 6)
    public BigDecimal getPxconnectelapsed() {
        return pxconnectelapsed;
    }

    public void setPxconnectelapsed(BigDecimal pxconnectelapsed) {
        this.pxconnectelapsed = pxconnectelapsed;
    }

    @Basic
    @Column(name = "pxdbinputbytes", nullable = true, precision = 0)
    public Integer getPxdbinputbytes() {
        return pxdbinputbytes;
    }

    public void setPxdbinputbytes(Integer pxdbinputbytes) {
        this.pxdbinputbytes = pxdbinputbytes;
    }

    @Basic
    @Column(name = "pxdbopexceedingthresholdcount", nullable = true, precision = 0)
    public Integer getPxdbopexceedingthresholdcount() {
        return pxdbopexceedingthresholdcount;
    }

    public void setPxdbopexceedingthresholdcount(Integer pxdbopexceedingthresholdcount) {
        this.pxdbopexceedingthresholdcount = pxdbopexceedingthresholdcount;
    }

    @Basic
    @Column(name = "pxdboutputbytes", nullable = true, precision = 0)
    public Integer getPxdboutputbytes() {
        return pxdboutputbytes;
    }

    public void setPxdboutputbytes(Integer pxdboutputbytes) {
        this.pxdboutputbytes = pxdboutputbytes;
    }

    @Basic
    @Column(name = "pxdeclarativerulereadcount", nullable = true, precision = 0)
    public Integer getPxdeclarativerulereadcount() {
        return pxdeclarativerulereadcount;
    }

    public void setPxdeclarativerulereadcount(Integer pxdeclarativerulereadcount) {
        this.pxdeclarativerulereadcount = pxdeclarativerulereadcount;
    }

    @Basic
    @Column(name = "pxdeclarativerulesinvokedcpu", nullable = true, precision = 6)
    public BigDecimal getPxdeclarativerulesinvokedcpu() {
        return pxdeclarativerulesinvokedcpu;
    }

    public void setPxdeclarativerulesinvokedcpu(BigDecimal pxdeclarativerulesinvokedcpu) {
        this.pxdeclarativerulesinvokedcpu = pxdeclarativerulesinvokedcpu;
    }

    @Basic
    @Column(name = "pxdeclarativerulesinvokedcount", nullable = true, precision = 0)
    public Integer getPxdeclarativerulesinvokedcount() {
        return pxdeclarativerulesinvokedcount;
    }

    public void setPxdeclarativerulesinvokedcount(Integer pxdeclarativerulesinvokedcount) {
        this.pxdeclarativerulesinvokedcount = pxdeclarativerulesinvokedcount;
    }

    @Basic
    @Column(name = "pxdeclarativeruleslookupcpu", nullable = true, precision = 6)
    public BigDecimal getPxdeclarativeruleslookupcpu() {
        return pxdeclarativeruleslookupcpu;
    }

    public void setPxdeclarativeruleslookupcpu(BigDecimal pxdeclarativeruleslookupcpu) {
        this.pxdeclarativeruleslookupcpu = pxdeclarativeruleslookupcpu;
    }

    @Basic
    @Column(name = "pxdeclarativeruleslookupcount", nullable = true, precision = 0)
    public Integer getPxdeclarativeruleslookupcount() {
        return pxdeclarativeruleslookupcount;
    }

    public void setPxdeclarativeruleslookupcount(Integer pxdeclarativeruleslookupcount) {
        this.pxdeclarativeruleslookupcount = pxdeclarativeruleslookupcount;
    }

    @Basic
    @Column(name = "pxdeclexprctxfreeusecount", nullable = true, precision = 0)
    public Integer getPxdeclexprctxfreeusecount() {
        return pxdeclexprctxfreeusecount;
    }

    public void setPxdeclexprctxfreeusecount(Integer pxdeclexprctxfreeusecount) {
        this.pxdeclexprctxfreeusecount = pxdeclexprctxfreeusecount;
    }

    @Basic
    @Column(name = "pxdeclexprctxsensusecount", nullable = true, precision = 0)
    public Integer getPxdeclexprctxsensusecount() {
        return pxdeclexprctxsensusecount;
    }

    public void setPxdeclexprctxsensusecount(Integer pxdeclexprctxsensusecount) {
        this.pxdeclexprctxsensusecount = pxdeclexprctxsensusecount;
    }

    @Basic
    @Column(name = "pxdeclntwksbuildhlelap", nullable = true, precision = 6)
    public BigDecimal getPxdeclntwksbuildhlelap() {
        return pxdeclntwksbuildhlelap;
    }

    public void setPxdeclntwksbuildhlelap(BigDecimal pxdeclntwksbuildhlelap) {
        this.pxdeclntwksbuildhlelap = pxdeclntwksbuildhlelap;
    }

    @Basic
    @Column(name = "pxdeclntwksbuildhlcpu", nullable = true, precision = 6)
    public BigDecimal getPxdeclntwksbuildhlcpu() {
        return pxdeclntwksbuildhlcpu;
    }

    public void setPxdeclntwksbuildhlcpu(BigDecimal pxdeclntwksbuildhlcpu) {
        this.pxdeclntwksbuildhlcpu = pxdeclntwksbuildhlcpu;
    }

    @Basic
    @Column(name = "pxdeclntwksbuildconstelapsed", nullable = true, precision = 6)
    public BigDecimal getPxdeclntwksbuildconstelapsed() {
        return pxdeclntwksbuildconstelapsed;
    }

    public void setPxdeclntwksbuildconstelapsed(BigDecimal pxdeclntwksbuildconstelapsed) {
        this.pxdeclntwksbuildconstelapsed = pxdeclntwksbuildconstelapsed;
    }

    @Basic
    @Column(name = "pxdeclntwksbuildconstcpu", nullable = true, precision = 6)
    public BigDecimal getPxdeclntwksbuildconstcpu() {
        return pxdeclntwksbuildconstcpu;
    }

    public void setPxdeclntwksbuildconstcpu(BigDecimal pxdeclntwksbuildconstcpu) {
        this.pxdeclntwksbuildconstcpu = pxdeclntwksbuildconstcpu;
    }

    @Basic
    @Column(name = "pxdeclrulesinvokedelapsed", nullable = true, precision = 6)
    public BigDecimal getPxdeclrulesinvokedelapsed() {
        return pxdeclrulesinvokedelapsed;
    }

    public void setPxdeclrulesinvokedelapsed(BigDecimal pxdeclrulesinvokedelapsed) {
        this.pxdeclrulesinvokedelapsed = pxdeclrulesinvokedelapsed;
    }

    @Basic
    @Column(name = "pxdeclrulesinvokedbckgrdcnt", nullable = true, precision = 0)
    public Integer getPxdeclrulesinvokedbckgrdcnt() {
        return pxdeclrulesinvokedbckgrdcnt;
    }

    public void setPxdeclrulesinvokedbckgrdcnt(Integer pxdeclrulesinvokedbckgrdcnt) {
        this.pxdeclrulesinvokedbckgrdcnt = pxdeclrulesinvokedbckgrdcnt;
    }

    @Basic
    @Column(name = "pxdeclruleslookupelapsed", nullable = true, precision = 6)
    public BigDecimal getPxdeclruleslookupelapsed() {
        return pxdeclruleslookupelapsed;
    }

    public void setPxdeclruleslookupelapsed(BigDecimal pxdeclruleslookupelapsed) {
        this.pxdeclruleslookupelapsed = pxdeclruleslookupelapsed;
    }

    @Basic
    @Column(name = "pxdecryptcount", nullable = true, precision = 6)
    public BigDecimal getPxdecryptcount() {
        return pxdecryptcount;
    }

    public void setPxdecryptcount(BigDecimal pxdecryptcount) {
        this.pxdecryptcount = pxdecryptcount;
    }

    @Basic
    @Column(name = "pxdecryptcpu", nullable = true, precision = 6)
    public BigDecimal getPxdecryptcpu() {
        return pxdecryptcpu;
    }

    public void setPxdecryptcpu(BigDecimal pxdecryptcpu) {
        this.pxdecryptcpu = pxdecryptcpu;
    }

    @Basic
    @Column(name = "pxdecryptelapsed", nullable = true, precision = 6)
    public BigDecimal getPxdecryptelapsed() {
        return pxdecryptelapsed;
    }

    public void setPxdecryptelapsed(BigDecimal pxdecryptelapsed) {
        this.pxdecryptelapsed = pxdecryptelapsed;
    }

    @Basic
    @Column(name = "pxencodedrulesets", nullable = true, length = 32)
    public String getPxencodedrulesets() {
        return pxencodedrulesets;
    }

    public void setPxencodedrulesets(String pxencodedrulesets) {
        this.pxencodedrulesets = pxencodedrulesets;
    }

    @Basic
    @Column(name = "pxencryptcount", nullable = true, precision = 6)
    public BigDecimal getPxencryptcount() {
        return pxencryptcount;
    }

    public void setPxencryptcount(BigDecimal pxencryptcount) {
        this.pxencryptcount = pxencryptcount;
    }

    @Basic
    @Column(name = "pxencryptcpu", nullable = true, precision = 6)
    public BigDecimal getPxencryptcpu() {
        return pxencryptcpu;
    }

    public void setPxencryptcpu(BigDecimal pxencryptcpu) {
        this.pxencryptcpu = pxencryptcpu;
    }

    @Basic
    @Column(name = "pxencryptelapsed", nullable = true, precision = 6)
    public BigDecimal getPxencryptelapsed() {
        return pxencryptelapsed;
    }

    public void setPxencryptelapsed(BigDecimal pxencryptelapsed) {
        this.pxencryptelapsed = pxencryptelapsed;
    }

    @Basic
    @Column(name = "pxflowcount", nullable = true, precision = 0)
    public Integer getPxflowcount() {
        return pxflowcount;
    }

    public void setPxflowcount(Integer pxflowcount) {
        this.pxflowcount = pxflowcount;
    }

    @Basic
    @Column(name = "pxindexcount", nullable = true, precision = 0)
    public Integer getPxindexcount() {
        return pxindexcount;
    }

    public void setPxindexcount(Integer pxindexcount) {
        this.pxindexcount = pxindexcount;
    }

    @Basic
    @Column(name = "pxinfergeneratedjavacount", nullable = true, precision = 0)
    public Integer getPxinfergeneratedjavacount() {
        return pxinfergeneratedjavacount;
    }

    public void setPxinfergeneratedjavacount(Integer pxinfergeneratedjavacount) {
        this.pxinfergeneratedjavacount = pxinfergeneratedjavacount;
    }

    @Basic
    @Column(name = "pxinfergeneratedjavacpu", nullable = true, precision = 6)
    public BigDecimal getPxinfergeneratedjavacpu() {
        return pxinfergeneratedjavacpu;
    }

    public void setPxinfergeneratedjavacpu(BigDecimal pxinfergeneratedjavacpu) {
        this.pxinfergeneratedjavacpu = pxinfergeneratedjavacpu;
    }

    @Basic
    @Column(name = "pxinfergeneratedjavaelapsed", nullable = true, precision = 6)
    public BigDecimal getPxinfergeneratedjavaelapsed() {
        return pxinfergeneratedjavaelapsed;
    }

    public void setPxinfergeneratedjavaelapsed(BigDecimal pxinfergeneratedjavaelapsed) {
        this.pxinfergeneratedjavaelapsed = pxinfergeneratedjavaelapsed;
    }

    @Basic
    @Column(name = "pxinfergeneratedjavahlelapsed", nullable = true, precision = 6)
    public BigDecimal getPxinfergeneratedjavahlelapsed() {
        return pxinfergeneratedjavahlelapsed;
    }

    public void setPxinfergeneratedjavahlelapsed(BigDecimal pxinfergeneratedjavahlelapsed) {
        this.pxinfergeneratedjavahlelapsed = pxinfergeneratedjavahlelapsed;
    }

    @Basic
    @Column(name = "pxinputbytes", nullable = true, precision = 0)
    public Integer getPxinputbytes() {
        return pxinputbytes;
    }

    public void setPxinputbytes(Integer pxinputbytes) {
        this.pxinputbytes = pxinputbytes;
    }

    @Basic
    @Column(name = "pxinsname", nullable = true, length = 128)
    public String getPxinsname() {
        return pxinsname;
    }

    public void setPxinsname(String pxinsname) {
        this.pxinsname = pxinsname;
    }

    @Basic
    @Column(name = "pxinteractions", nullable = true, precision = 0)
    public Integer getPxinteractions() {
        return pxinteractions;
    }

    public void setPxinteractions(Integer pxinteractions) {
        this.pxinteractions = pxinteractions;
    }

    @Basic
    @Column(name = "pxjavaassemblecpu", nullable = true, precision = 6)
    public BigDecimal getPxjavaassemblecpu() {
        return pxjavaassemblecpu;
    }

    public void setPxjavaassemblecpu(BigDecimal pxjavaassemblecpu) {
        this.pxjavaassemblecpu = pxjavaassemblecpu;
    }

    @Basic
    @Column(name = "pxjavaassemblecount", nullable = true, precision = 0)
    public Integer getPxjavaassemblecount() {
        return pxjavaassemblecount;
    }

    public void setPxjavaassemblecount(Integer pxjavaassemblecount) {
        this.pxjavaassemblecount = pxjavaassemblecount;
    }

    @Basic
    @Column(name = "pxjavaassembleelapsed", nullable = true, precision = 6)
    public BigDecimal getPxjavaassembleelapsed() {
        return pxjavaassembleelapsed;
    }

    public void setPxjavaassembleelapsed(BigDecimal pxjavaassembleelapsed) {
        this.pxjavaassembleelapsed = pxjavaassembleelapsed;
    }

    @Basic
    @Column(name = "pxjavaassemblehlelapsed", nullable = true, precision = 6)
    public BigDecimal getPxjavaassemblehlelapsed() {
        return pxjavaassemblehlelapsed;
    }

    public void setPxjavaassemblehlelapsed(BigDecimal pxjavaassemblehlelapsed) {
        this.pxjavaassemblehlelapsed = pxjavaassemblehlelapsed;
    }

    @Basic
    @Column(name = "pxjavacompilecpu", nullable = true, precision = 6)
    public BigDecimal getPxjavacompilecpu() {
        return pxjavacompilecpu;
    }

    public void setPxjavacompilecpu(BigDecimal pxjavacompilecpu) {
        this.pxjavacompilecpu = pxjavacompilecpu;
    }

    @Basic
    @Column(name = "pxjavacompilecount", nullable = true, precision = 0)
    public Integer getPxjavacompilecount() {
        return pxjavacompilecount;
    }

    public void setPxjavacompilecount(Integer pxjavacompilecount) {
        this.pxjavacompilecount = pxjavacompilecount;
    }

    @Basic
    @Column(name = "pxjavacompileelapsed", nullable = true, precision = 6)
    public BigDecimal getPxjavacompileelapsed() {
        return pxjavacompileelapsed;
    }

    public void setPxjavacompileelapsed(BigDecimal pxjavacompileelapsed) {
        this.pxjavacompileelapsed = pxjavacompileelapsed;
    }

    @Basic
    @Column(name = "pxjavageneratecpu", nullable = true, precision = 6)
    public BigDecimal getPxjavageneratecpu() {
        return pxjavageneratecpu;
    }

    public void setPxjavageneratecpu(BigDecimal pxjavageneratecpu) {
        this.pxjavageneratecpu = pxjavageneratecpu;
    }

    @Basic
    @Column(name = "pxjavageneratecount", nullable = true, precision = 0)
    public Integer getPxjavageneratecount() {
        return pxjavageneratecount;
    }

    public void setPxjavageneratecount(Integer pxjavageneratecount) {
        this.pxjavageneratecount = pxjavageneratecount;
    }

    @Basic
    @Column(name = "pxjavagenerateelapsed", nullable = true, precision = 6)
    public BigDecimal getPxjavagenerateelapsed() {
        return pxjavagenerateelapsed;
    }

    public void setPxjavagenerateelapsed(BigDecimal pxjavagenerateelapsed) {
        this.pxjavagenerateelapsed = pxjavagenerateelapsed;
    }

    @Basic
    @Column(name = "pxjavastepcpu", nullable = true, precision = 6)
    public BigDecimal getPxjavastepcpu() {
        return pxjavastepcpu;
    }

    public void setPxjavastepcpu(BigDecimal pxjavastepcpu) {
        this.pxjavastepcpu = pxjavastepcpu;
    }

    @Basic
    @Column(name = "pxjavastepcount", nullable = true, precision = 0)
    public Integer getPxjavastepcount() {
        return pxjavastepcount;
    }

    public void setPxjavastepcount(Integer pxjavastepcount) {
        this.pxjavastepcount = pxjavastepcount;
    }

    @Basic
    @Column(name = "pxjavastepelapsed", nullable = true, precision = 6)
    public BigDecimal getPxjavastepelapsed() {
        return pxjavastepelapsed;
    }

    public void setPxjavastepelapsed(BigDecimal pxjavastepelapsed) {
        this.pxjavastepelapsed = pxjavastepelapsed;
    }

    @Basic
    @Column(name = "pxjavasyntaxcpu", nullable = true, precision = 6)
    public BigDecimal getPxjavasyntaxcpu() {
        return pxjavasyntaxcpu;
    }

    public void setPxjavasyntaxcpu(BigDecimal pxjavasyntaxcpu) {
        this.pxjavasyntaxcpu = pxjavasyntaxcpu;
    }

    @Basic
    @Column(name = "pxjavasyntaxcount", nullable = true, precision = 0)
    public Integer getPxjavasyntaxcount() {
        return pxjavasyntaxcount;
    }

    public void setPxjavasyntaxcount(Integer pxjavasyntaxcount) {
        this.pxjavasyntaxcount = pxjavasyntaxcount;
    }

    @Basic
    @Column(name = "pxjavasyntaxelapsed", nullable = true, precision = 6)
    public BigDecimal getPxjavasyntaxelapsed() {
        return pxjavasyntaxelapsed;
    }

    public void setPxjavasyntaxelapsed(BigDecimal pxjavasyntaxelapsed) {
        this.pxjavasyntaxelapsed = pxjavasyntaxelapsed;
    }

    @Basic
    @Column(name = "pxlegacyruleapiusedcount", nullable = true, precision = 0)
    public Integer getPxlegacyruleapiusedcount() {
        return pxlegacyruleapiusedcount;
    }

    public void setPxlegacyruleapiusedcount(Integer pxlegacyruleapiusedcount) {
        this.pxlegacyruleapiusedcount = pxlegacyruleapiusedcount;
    }

    @Basic
    @Column(name = "pxlistrowwithfilteredstrmcnt", nullable = true, precision = 0)
    public Integer getPxlistrowwithfilteredstrmcnt() {
        return pxlistrowwithfilteredstrmcnt;
    }

    public void setPxlistrowwithfilteredstrmcnt(Integer pxlistrowwithfilteredstrmcnt) {
        this.pxlistrowwithfilteredstrmcnt = pxlistrowwithfilteredstrmcnt;
    }

    @Basic
    @Column(name = "pxlistrowwithunfilteredstrmcnt", nullable = true, precision = 0)
    public Integer getPxlistrowwithunfilteredstrmcnt() {
        return pxlistrowwithunfilteredstrmcnt;
    }

    public void setPxlistrowwithunfilteredstrmcnt(Integer pxlistrowwithunfilteredstrmcnt) {
        this.pxlistrowwithunfilteredstrmcnt = pxlistrowwithunfilteredstrmcnt;
    }

    @Basic
    @Column(name = "pxlistrowwithoutstreamcount", nullable = true, precision = 0)
    public Integer getPxlistrowwithoutstreamcount() {
        return pxlistrowwithoutstreamcount;
    }

    public void setPxlistrowwithoutstreamcount(Integer pxlistrowwithoutstreamcount) {
        this.pxlistrowwithoutstreamcount = pxlistrowwithoutstreamcount;
    }

    @Basic
    @Column(name = "pxlistwithfilteredstreamcount", nullable = true, precision = 0)
    public Integer getPxlistwithfilteredstreamcount() {
        return pxlistwithfilteredstreamcount;
    }

    public void setPxlistwithfilteredstreamcount(Integer pxlistwithfilteredstreamcount) {
        this.pxlistwithfilteredstreamcount = pxlistwithfilteredstreamcount;
    }

    @Basic
    @Column(name = "pxlistwithunfilteredstrmcnt", nullable = true, precision = 0)
    public Integer getPxlistwithunfilteredstrmcnt() {
        return pxlistwithunfilteredstrmcnt;
    }

    public void setPxlistwithunfilteredstrmcnt(Integer pxlistwithunfilteredstrmcnt) {
        this.pxlistwithunfilteredstrmcnt = pxlistwithunfilteredstrmcnt;
    }

    @Basic
    @Column(name = "pxlistwithoutstreamcount", nullable = true, precision = 0)
    public Integer getPxlistwithoutstreamcount() {
        return pxlistwithoutstreamcount;
    }

    public void setPxlistwithoutstreamcount(Integer pxlistwithoutstreamcount) {
        this.pxlistwithoutstreamcount = pxlistwithoutstreamcount;
    }

    @Basic
    @Column(name = "pxlookuplistdbfetches", nullable = true, precision = 0)
    public Integer getPxlookuplistdbfetches() {
        return pxlookuplistdbfetches;
    }

    public void setPxlookuplistdbfetches(Integer pxlookuplistdbfetches) {
        this.pxlookuplistdbfetches = pxlookuplistdbfetches;
    }

    @Basic
    @Column(name = "pxnewfuainstances", nullable = true, precision = 0)
    public Integer getPxnewfuainstances() {
        return pxnewfuainstances;
    }

    public void setPxnewfuainstances(Integer pxnewfuainstances) {
        this.pxnewfuainstances = pxnewfuainstances;
    }

    @Basic
    @Column(name = "pxobjclass", nullable = true, length = 96)
    public String getPxobjclass() {
        return pxobjclass;
    }

    public void setPxobjclass(String pxobjclass) {
        this.pxobjclass = pxobjclass;
    }

    @Basic
    @Column(name = "pxotherbrowsecpu", nullable = true, precision = 6)
    public BigDecimal getPxotherbrowsecpu() {
        return pxotherbrowsecpu;
    }

    public void setPxotherbrowsecpu(BigDecimal pxotherbrowsecpu) {
        this.pxotherbrowsecpu = pxotherbrowsecpu;
    }

    @Basic
    @Column(name = "pxotherbrowseelapsed", nullable = true, precision = 6)
    public BigDecimal getPxotherbrowseelapsed() {
        return pxotherbrowseelapsed;
    }

    public void setPxotherbrowseelapsed(BigDecimal pxotherbrowseelapsed) {
        this.pxotherbrowseelapsed = pxotherbrowseelapsed;
    }

    @Basic
    @Column(name = "pxotherbrowsefiltercpu", nullable = true, precision = 6)
    public BigDecimal getPxotherbrowsefiltercpu() {
        return pxotherbrowsefiltercpu;
    }

    public void setPxotherbrowsefiltercpu(BigDecimal pxotherbrowsefiltercpu) {
        this.pxotherbrowsefiltercpu = pxotherbrowsefiltercpu;
    }

    @Basic
    @Column(name = "pxotherbrowsefiltercnt", nullable = true, precision = 0)
    public Integer getPxotherbrowsefiltercnt() {
        return pxotherbrowsefiltercnt;
    }

    public void setPxotherbrowsefiltercnt(Integer pxotherbrowsefiltercnt) {
        this.pxotherbrowsefiltercnt = pxotherbrowsefiltercnt;
    }

    @Basic
    @Column(name = "pxotherbrowsefilterelapsed", nullable = true, precision = 6)
    public BigDecimal getPxotherbrowsefilterelapsed() {
        return pxotherbrowsefilterelapsed;
    }

    public void setPxotherbrowsefilterelapsed(BigDecimal pxotherbrowsefilterelapsed) {
        this.pxotherbrowsefilterelapsed = pxotherbrowsefilterelapsed;
    }

    @Basic
    @Column(name = "pxotherbrowsereturned", nullable = true, precision = 0)
    public Integer getPxotherbrowsereturned() {
        return pxotherbrowsereturned;
    }

    public void setPxotherbrowsereturned(Integer pxotherbrowsereturned) {
        this.pxotherbrowsereturned = pxotherbrowsereturned;
    }

    @Basic
    @Column(name = "pxothercount", nullable = true, precision = 0)
    public Integer getPxothercount() {
        return pxothercount;
    }

    public void setPxothercount(Integer pxothercount) {
        this.pxothercount = pxothercount;
    }

    @Basic
    @Column(name = "pxotherfromcachecount", nullable = true, precision = 0)
    public Integer getPxotherfromcachecount() {
        return pxotherfromcachecount;
    }

    public void setPxotherfromcachecount(Integer pxotherfromcachecount) {
        this.pxotherfromcachecount = pxotherfromcachecount;
    }

    @Basic
    @Column(name = "pxotheriocpu", nullable = true, precision = 6)
    public BigDecimal getPxotheriocpu() {
        return pxotheriocpu;
    }

    public void setPxotheriocpu(BigDecimal pxotheriocpu) {
        this.pxotheriocpu = pxotheriocpu;
    }

    @Basic
    @Column(name = "pxotheriocount", nullable = true, precision = 0)
    public Integer getPxotheriocount() {
        return pxotheriocount;
    }

    public void setPxotheriocount(Integer pxotheriocount) {
        this.pxotheriocount = pxotheriocount;
    }

    @Basic
    @Column(name = "pxotherioelapsed", nullable = true, precision = 6)
    public BigDecimal getPxotherioelapsed() {
        return pxotherioelapsed;
    }

    public void setPxotherioelapsed(BigDecimal pxotherioelapsed) {
        this.pxotherioelapsed = pxotherioelapsed;
    }

    @Basic
    @Column(name = "pxoutputbytes", nullable = true, precision = 0)
    public Integer getPxoutputbytes() {
        return pxoutputbytes;
    }

    public void setPxoutputbytes(Integer pxoutputbytes) {
        this.pxoutputbytes = pxoutputbytes;
    }

    @Basic
    @Column(name = "pxparserulecount", nullable = true, precision = 0)
    public Integer getPxparserulecount() {
        return pxparserulecount;
    }

    public void setPxparserulecount(Integer pxparserulecount) {
        this.pxparserulecount = pxparserulecount;
    }

    @Basic
    @Column(name = "pxparseruletime", nullable = true, precision = 6)
    public BigDecimal getPxparseruletime() {
        return pxparseruletime;
    }

    public void setPxparseruletime(BigDecimal pxparseruletime) {
        this.pxparseruletime = pxparseruletime;
    }

    @Basic
    @Column(name = "pxparseruletimecpu", nullable = true, precision = 6)
    public BigDecimal getPxparseruletimecpu() {
        return pxparseruletimecpu;
    }

    public void setPxparseruletimecpu(BigDecimal pxparseruletimecpu) {
        this.pxparseruletimecpu = pxparseruletimecpu;
    }

    @Basic
    @Column(name = "pxpassivationcount", nullable = true, precision = 0)
    public Integer getPxpassivationcount() {
        return pxpassivationcount;
    }

    public void setPxpassivationcount(Integer pxpassivationcount) {
        this.pxpassivationcount = pxpassivationcount;
    }

    @Basic
    @Column(name = "pxpassivationdatatimecpu", nullable = true, precision = 6)
    public BigDecimal getPxpassivationdatatimecpu() {
        return pxpassivationdatatimecpu;
    }

    public void setPxpassivationdatatimecpu(BigDecimal pxpassivationdatatimecpu) {
        this.pxpassivationdatatimecpu = pxpassivationdatatimecpu;
    }

    @Basic
    @Column(name = "pxpassivationdatatimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxpassivationdatatimeelapsed() {
        return pxpassivationdatatimeelapsed;
    }

    public void setPxpassivationdatatimeelapsed(BigDecimal pxpassivationdatatimeelapsed) {
        this.pxpassivationdatatimeelapsed = pxpassivationdatatimeelapsed;
    }

    @Basic
    @Column(name = "pxpassivationidletimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxpassivationidletimeelapsed() {
        return pxpassivationidletimeelapsed;
    }

    public void setPxpassivationidletimeelapsed(BigDecimal pxpassivationidletimeelapsed) {
        this.pxpassivationidletimeelapsed = pxpassivationidletimeelapsed;
    }

    @Basic
    @Column(name = "pxpassivationsizeaverage", nullable = true, precision = 0)
    public Integer getPxpassivationsizeaverage() {
        return pxpassivationsizeaverage;
    }

    public void setPxpassivationsizeaverage(Integer pxpassivationsizeaverage) {
        this.pxpassivationsizeaverage = pxpassivationsizeaverage;
    }

    @Basic
    @Column(name = "pxpassivationsizelast", nullable = true, precision = 0)
    public Integer getPxpassivationsizelast() {
        return pxpassivationsizelast;
    }

    public void setPxpassivationsizelast(Integer pxpassivationsizelast) {
        this.pxpassivationsizelast = pxpassivationsizelast;
    }

    @Basic
    @Column(name = "pxpassivationsizepeak", nullable = true, precision = 0)
    public Integer getPxpassivationsizepeak() {
        return pxpassivationsizepeak;
    }

    public void setPxpassivationsizepeak(Integer pxpassivationsizepeak) {
        this.pxpassivationsizepeak = pxpassivationsizepeak;
    }

    @Basic
    @Column(name = "pxproceduralrulereadcount", nullable = true, precision = 0)
    public Integer getPxproceduralrulereadcount() {
        return pxproceduralrulereadcount;
    }

    public void setPxproceduralrulereadcount(Integer pxproceduralrulereadcount) {
        this.pxproceduralrulereadcount = pxproceduralrulereadcount;
    }

    @Basic
    @Column(name = "pxprocesscpu", nullable = true, precision = 6)
    public BigDecimal getPxprocesscpu() {
        return pxprocesscpu;
    }

    public void setPxprocesscpu(BigDecimal pxprocesscpu) {
        this.pxprocesscpu = pxprocesscpu;
    }

    @Basic
    @Column(name = "pxproclabel", nullable = true, length = 128)
    public String getPxproclabel() {
        return pxproclabel;
    }

    public void setPxproclabel(String pxproclabel) {
        this.pxproclabel = pxproclabel;
    }

    @Basic
    @Column(name = "pxpropertyreadcount", nullable = true, precision = 0)
    public Integer getPxpropertyreadcount() {
        return pxpropertyreadcount;
    }

    public void setPxpropertyreadcount(Integer pxpropertyreadcount) {
        this.pxpropertyreadcount = pxpropertyreadcount;
    }

    @Basic
    @Column(name = "pxrdbiocount", nullable = true, precision = 0)
    public Integer getPxrdbiocount() {
        return pxrdbiocount;
    }

    public void setPxrdbiocount(Integer pxrdbiocount) {
        this.pxrdbiocount = pxrdbiocount;
    }

    @Basic
    @Column(name = "pxrdbioelapsed", nullable = true, precision = 6)
    public BigDecimal getPxrdbioelapsed() {
        return pxrdbioelapsed;
    }

    public void setPxrdbioelapsed(BigDecimal pxrdbioelapsed) {
        this.pxrdbioelapsed = pxrdbioelapsed;
    }

    @Basic
    @Column(name = "pxrdbrowwithstreamcount", nullable = true, precision = 0)
    public Integer getPxrdbrowwithstreamcount() {
        return pxrdbrowwithstreamcount;
    }

    public void setPxrdbrowwithstreamcount(Integer pxrdbrowwithstreamcount) {
        this.pxrdbrowwithstreamcount = pxrdbrowwithstreamcount;
    }

    @Basic
    @Column(name = "pxrdbrowwithoutstreamcount", nullable = true, precision = 0)
    public Integer getPxrdbrowwithoutstreamcount() {
        return pxrdbrowwithoutstreamcount;
    }

    public void setPxrdbrowwithoutstreamcount(Integer pxrdbrowwithoutstreamcount) {
        this.pxrdbrowwithoutstreamcount = pxrdbrowwithoutstreamcount;
    }

    @Basic
    @Column(name = "pxrdbwithstreamcount", nullable = true, precision = 0)
    public Integer getPxrdbwithstreamcount() {
        return pxrdbwithstreamcount;
    }

    public void setPxrdbwithstreamcount(Integer pxrdbwithstreamcount) {
        this.pxrdbwithstreamcount = pxrdbwithstreamcount;
    }

    @Basic
    @Column(name = "pxrdbwithoutstreamcount", nullable = true, precision = 0)
    public Integer getPxrdbwithoutstreamcount() {
        return pxrdbwithoutstreamcount;
    }

    public void setPxrdbwithoutstreamcount(Integer pxrdbwithoutstreamcount) {
        this.pxrdbwithoutstreamcount = pxrdbwithoutstreamcount;
    }

    @Basic
    @Column(name = "pxreferencepropertyusecpu", nullable = true, precision = 6)
    public BigDecimal getPxreferencepropertyusecpu() {
        return pxreferencepropertyusecpu;
    }

    public void setPxreferencepropertyusecpu(BigDecimal pxreferencepropertyusecpu) {
        this.pxreferencepropertyusecpu = pxreferencepropertyusecpu;
    }

    @Basic
    @Column(name = "pxreferencepropertyusecount", nullable = true, precision = 0)
    public Integer getPxreferencepropertyusecount() {
        return pxreferencepropertyusecount;
    }

    public void setPxreferencepropertyusecount(Integer pxreferencepropertyusecount) {
        this.pxreferencepropertyusecount = pxreferencepropertyusecount;
    }

    @Basic
    @Column(name = "pxreferencepropertyuseelapsed", nullable = true, precision = 6)
    public BigDecimal getPxreferencepropertyuseelapsed() {
        return pxreferencepropertyuseelapsed;
    }

    public void setPxreferencepropertyuseelapsed(BigDecimal pxreferencepropertyuseelapsed) {
        this.pxreferencepropertyuseelapsed = pxreferencepropertyuseelapsed;
    }

    @Basic
    @Column(name = "pxrequestorid", nullable = false, length = 36)
    public String getPxrequestorid() {
        return pxrequestorid;
    }

    public void setPxrequestorid(String pxrequestorid) {
        this.pxrequestorid = pxrequestorid;
    }

    @Basic
    @Column(name = "pxrequestorstart", nullable = false)
    public Timestamp getPxrequestorstart() {
        return pxrequestorstart;
    }

    public void setPxrequestorstart(Timestamp pxrequestorstart) {
        this.pxrequestorstart = pxrequestorstart;
    }

    @Basic
    @Column(name = "pxrequestortype", nullable = true, length = 32)
    public String getPxrequestortype() {
        return pxrequestortype;
    }

    public void setPxrequestortype(String pxrequestortype) {
        this.pxrequestortype = pxrequestortype;
    }

    @Basic
    @Column(name = "pxrulebrowsecpu", nullable = true, precision = 6)
    public BigDecimal getPxrulebrowsecpu() {
        return pxrulebrowsecpu;
    }

    public void setPxrulebrowsecpu(BigDecimal pxrulebrowsecpu) {
        this.pxrulebrowsecpu = pxrulebrowsecpu;
    }

    @Basic
    @Column(name = "pxrulebrowseelapsed", nullable = true, precision = 6)
    public BigDecimal getPxrulebrowseelapsed() {
        return pxrulebrowseelapsed;
    }

    public void setPxrulebrowseelapsed(BigDecimal pxrulebrowseelapsed) {
        this.pxrulebrowseelapsed = pxrulebrowseelapsed;
    }

    @Basic
    @Column(name = "pxrulebrowsefiltercpu", nullable = true, precision = 6)
    public BigDecimal getPxrulebrowsefiltercpu() {
        return pxrulebrowsefiltercpu;
    }

    public void setPxrulebrowsefiltercpu(BigDecimal pxrulebrowsefiltercpu) {
        this.pxrulebrowsefiltercpu = pxrulebrowsefiltercpu;
    }

    @Basic
    @Column(name = "pxrulebrowsefiltercnt", nullable = true, precision = 0)
    public Integer getPxrulebrowsefiltercnt() {
        return pxrulebrowsefiltercnt;
    }

    public void setPxrulebrowsefiltercnt(Integer pxrulebrowsefiltercnt) {
        this.pxrulebrowsefiltercnt = pxrulebrowsefiltercnt;
    }

    @Basic
    @Column(name = "pxrulebrowsefilterelapsed", nullable = true, precision = 6)
    public BigDecimal getPxrulebrowsefilterelapsed() {
        return pxrulebrowsefilterelapsed;
    }

    public void setPxrulebrowsefilterelapsed(BigDecimal pxrulebrowsefilterelapsed) {
        this.pxrulebrowsefilterelapsed = pxrulebrowsefilterelapsed;
    }

    @Basic
    @Column(name = "pxrulebrowsereturned", nullable = true, precision = 0)
    public Integer getPxrulebrowsereturned() {
        return pxrulebrowsereturned;
    }

    public void setPxrulebrowsereturned(Integer pxrulebrowsereturned) {
        this.pxrulebrowsereturned = pxrulebrowsereturned;
    }

    @Basic
    @Column(name = "pxrulecpu", nullable = true, precision = 6)
    public BigDecimal getPxrulecpu() {
        return pxrulecpu;
    }

    public void setPxrulecpu(BigDecimal pxrulecpu) {
        this.pxrulecpu = pxrulecpu;
    }

    @Basic
    @Column(name = "pxrulecount", nullable = true, precision = 0)
    public Integer getPxrulecount() {
        return pxrulecount;
    }

    public void setPxrulecount(Integer pxrulecount) {
        this.pxrulecount = pxrulecount;
    }

    @Basic
    @Column(name = "pxrulefromcachecount", nullable = true, precision = 0)
    public Integer getPxrulefromcachecount() {
        return pxrulefromcachecount;
    }

    public void setPxrulefromcachecount(Integer pxrulefromcachecount) {
        this.pxrulefromcachecount = pxrulefromcachecount;
    }

    @Basic
    @Column(name = "pxruleioelapsed", nullable = true, precision = 6)
    public BigDecimal getPxruleioelapsed() {
        return pxruleioelapsed;
    }

    public void setPxruleioelapsed(BigDecimal pxruleioelapsed) {
        this.pxruleioelapsed = pxruleioelapsed;
    }

    @Basic
    @Column(name = "pxrulesexecuted", nullable = true, precision = 0)
    public Integer getPxrulesexecuted() {
        return pxrulesexecuted;
    }

    public void setPxrulesexecuted(Integer pxrulesexecuted) {
        this.pxrulesexecuted = pxrulesexecuted;
    }

    @Basic
    @Column(name = "pxrulesused", nullable = true, precision = 0)
    public Integer getPxrulesused() {
        return pxrulesused;
    }

    public void setPxrulesused(Integer pxrulesused) {
        this.pxrulesused = pxrulesused;
    }

    @Basic
    @Column(name = "pxrunmodelcount", nullable = true, precision = 0)
    public Integer getPxrunmodelcount() {
        return pxrunmodelcount;
    }

    public void setPxrunmodelcount(Integer pxrunmodelcount) {
        this.pxrunmodelcount = pxrunmodelcount;
    }

    @Basic
    @Column(name = "pxrunotherrulecount", nullable = true, precision = 0)
    public Integer getPxrunotherrulecount() {
        return pxrunotherrulecount;
    }

    public void setPxrunotherrulecount(Integer pxrunotherrulecount) {
        this.pxrunotherrulecount = pxrunotherrulecount;
    }

    @Basic
    @Column(name = "pxrunstreamcount", nullable = true, precision = 0)
    public Integer getPxrunstreamcount() {
        return pxrunstreamcount;
    }

    public void setPxrunstreamcount(Integer pxrunstreamcount) {
        this.pxrunstreamcount = pxrunstreamcount;
    }

    @Basic
    @Column(name = "pxrunwhencount", nullable = true, precision = 0)
    public Integer getPxrunwhencount() {
        return pxrunwhencount;
    }

    public void setPxrunwhencount(Integer pxrunwhencount) {
        this.pxrunwhencount = pxrunwhencount;
    }

    @Basic
    @Column(name = "pxsavedcbafterintcount", nullable = true, precision = 6)
    public BigDecimal getPxsavedcbafterintcount() {
        return pxsavedcbafterintcount;
    }

    public void setPxsavedcbafterintcount(BigDecimal pxsavedcbafterintcount) {
        this.pxsavedcbafterintcount = pxsavedcbafterintcount;
    }

    @Basic
    @Column(name = "pxsavedcbafterintcpu", nullable = true, precision = 0)
    public Integer getPxsavedcbafterintcpu() {
        return pxsavedcbafterintcpu;
    }

    public void setPxsavedcbafterintcpu(Integer pxsavedcbafterintcpu) {
        this.pxsavedcbafterintcpu = pxsavedcbafterintcpu;
    }

    @Basic
    @Column(name = "pxsavedcbafterintelapsed", nullable = true, precision = 6)
    public BigDecimal getPxsavedcbafterintelapsed() {
        return pxsavedcbafterintelapsed;
    }

    public void setPxsavedcbafterintelapsed(BigDecimal pxsavedcbafterintelapsed) {
        this.pxsavedcbafterintelapsed = pxsavedcbafterintelapsed;
    }

    @Basic
    @Column(name = "pxsavedcxtafterintcpu", nullable = true, precision = 6)
    public BigDecimal getPxsavedcxtafterintcpu() {
        return pxsavedcxtafterintcpu;
    }

    public void setPxsavedcxtafterintcpu(BigDecimal pxsavedcxtafterintcpu) {
        this.pxsavedcxtafterintcpu = pxsavedcxtafterintcpu;
    }

    @Basic
    @Column(name = "pxsavedcxtafterintcount", nullable = true, precision = 0)
    public Integer getPxsavedcxtafterintcount() {
        return pxsavedcxtafterintcount;
    }

    public void setPxsavedcxtafterintcount(Integer pxsavedcxtafterintcount) {
        this.pxsavedcxtafterintcount = pxsavedcxtafterintcount;
    }

    @Basic
    @Column(name = "pxsavedcxtafterintelapsed", nullable = true, precision = 6)
    public BigDecimal getPxsavedcxtafterintelapsed() {
        return pxsavedcxtafterintelapsed;
    }

    public void setPxsavedcxtafterintelapsed(BigDecimal pxsavedcxtafterintelapsed) {
        this.pxsavedcxtafterintelapsed = pxsavedcxtafterintelapsed;
    }

    @Basic
    @Column(name = "pxserviceactivitycpu", nullable = true, precision = 6)
    public BigDecimal getPxserviceactivitycpu() {
        return pxserviceactivitycpu;
    }

    public void setPxserviceactivitycpu(BigDecimal pxserviceactivitycpu) {
        this.pxserviceactivitycpu = pxserviceactivitycpu;
    }

    @Basic
    @Column(name = "pxserviceactivitytime", nullable = true, precision = 6)
    public BigDecimal getPxserviceactivitytime() {
        return pxserviceactivitytime;
    }

    public void setPxserviceactivitytime(BigDecimal pxserviceactivitytime) {
        this.pxserviceactivitytime = pxserviceactivitytime;
    }

    @Basic
    @Column(name = "pxservicecount", nullable = true, precision = 0)
    public Integer getPxservicecount() {
        return pxservicecount;
    }

    public void setPxservicecount(Integer pxservicecount) {
        this.pxservicecount = pxservicecount;
    }

    @Basic
    @Column(name = "pxservicedatavolume", nullable = true, precision = 0)
    public Integer getPxservicedatavolume() {
        return pxservicedatavolume;
    }

    public void setPxservicedatavolume(Integer pxservicedatavolume) {
        this.pxservicedatavolume = pxservicedatavolume;
    }

    @Basic
    @Column(name = "pxserviceinmapreqcpu", nullable = true, precision = 6)
    public BigDecimal getPxserviceinmapreqcpu() {
        return pxserviceinmapreqcpu;
    }

    public void setPxserviceinmapreqcpu(BigDecimal pxserviceinmapreqcpu) {
        this.pxserviceinmapreqcpu = pxserviceinmapreqcpu;
    }

    @Basic
    @Column(name = "pxserviceinmapreqtime", nullable = true, precision = 6)
    public BigDecimal getPxserviceinmapreqtime() {
        return pxserviceinmapreqtime;
    }

    public void setPxserviceinmapreqtime(BigDecimal pxserviceinmapreqtime) {
        this.pxserviceinmapreqtime = pxserviceinmapreqtime;
    }

    @Basic
    @Column(name = "pxservicenumfilerecords", nullable = true, precision = 0)
    public Integer getPxservicenumfilerecords() {
        return pxservicenumfilerecords;
    }

    public void setPxservicenumfilerecords(Integer pxservicenumfilerecords) {
        this.pxservicenumfilerecords = pxservicenumfilerecords;
    }

    @Basic
    @Column(name = "pxserviceoutmapreqcpu", nullable = true, precision = 6)
    public BigDecimal getPxserviceoutmapreqcpu() {
        return pxserviceoutmapreqcpu;
    }

    public void setPxserviceoutmapreqcpu(BigDecimal pxserviceoutmapreqcpu) {
        this.pxserviceoutmapreqcpu = pxserviceoutmapreqcpu;
    }

    @Basic
    @Column(name = "pxserviceoutmapreqtime", nullable = true, precision = 6)
    public BigDecimal getPxserviceoutmapreqtime() {
        return pxserviceoutmapreqtime;
    }

    public void setPxserviceoutmapreqtime(BigDecimal pxserviceoutmapreqtime) {
        this.pxserviceoutmapreqtime = pxserviceoutmapreqtime;
    }

    @Basic
    @Column(name = "pxsnapshottime", nullable = false)
    public Timestamp getPxsnapshottime() {
        return pxsnapshottime;
    }

    public void setPxsnapshottime(Timestamp pxsnapshottime) {
        this.pxsnapshottime = pxsnapshottime;
    }

    @Basic
    @Column(name = "pxsnapshottype", nullable = false, length = 32)
    public String getPxsnapshottype() {
        return pxsnapshottype;
    }

    public void setPxsnapshottype(String pxsnapshottype) {
        this.pxsnapshottype = pxsnapshottype;
    }

    @Basic
    @Column(name = "pxstreamtimecpu", nullable = true, precision = 6)
    public BigDecimal getPxstreamtimecpu() {
        return pxstreamtimecpu;
    }

    public void setPxstreamtimecpu(BigDecimal pxstreamtimecpu) {
        this.pxstreamtimecpu = pxstreamtimecpu;
    }

    @Basic
    @Column(name = "pxstreamtimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxstreamtimeelapsed() {
        return pxstreamtimeelapsed;
    }

    public void setPxstreamtimeelapsed(BigDecimal pxstreamtimeelapsed) {
        this.pxstreamtimeelapsed = pxstreamtimeelapsed;
    }

    @Basic
    @Column(name = "pxsystemname", nullable = true, length = 32)
    public String getPxsystemname() {
        return pxsystemname;
    }

    public void setPxsystemname(String pxsystemname) {
        this.pxsystemname = pxsystemname;
    }

    @Basic
    @Column(name = "pxsystemnode", nullable = true, length = 64)
    public String getPxsystemnode() {
        return pxsystemnode;
    }

    public void setPxsystemnode(String pxsystemnode) {
        this.pxsystemnode = pxsystemnode;
    }

    @Basic
    @Column(name = "pxsystemnodeid", nullable = false, length = 64)
    public String getPxsystemnodeid() {
        return pxsystemnodeid;
    }

    public void setPxsystemnodeid(String pxsystemnodeid) {
        this.pxsystemnodeid = pxsystemnodeid;
    }

    @Basic
    @Column(name = "pxsystemstart", nullable = true)
    public Timestamp getPxsystemstart() {
        return pxsystemstart;
    }

    public void setPxsystemstart(Timestamp pxsystemstart) {
        this.pxsystemstart = pxsystemstart;
    }

    @Basic
    @Column(name = "pxtotalreqcpu", nullable = true, precision = 6)
    public BigDecimal getPxtotalreqcpu() {
        return pxtotalreqcpu;
    }

    public void setPxtotalreqcpu(BigDecimal pxtotalreqcpu) {
        this.pxtotalreqcpu = pxtotalreqcpu;
    }

    @Basic
    @Column(name = "pxtotalreqtime", nullable = true, precision = 6)
    public BigDecimal getPxtotalreqtime() {
        return pxtotalreqtime;
    }

    public void setPxtotalreqtime(BigDecimal pxtotalreqtime) {
        this.pxtotalreqtime = pxtotalreqtime;
    }

    @Basic
    @Column(name = "pxtrackedpropertychangescount", nullable = true, precision = 0)
    public Integer getPxtrackedpropertychangescount() {
        return pxtrackedpropertychangescount;
    }

    public void setPxtrackedpropertychangescount(Integer pxtrackedpropertychangescount) {
        this.pxtrackedpropertychangescount = pxtrackedpropertychangescount;
    }

    @Basic
    @Column(name = "pxtransientjavaassemblecpu", nullable = true, precision = 6)
    public BigDecimal getPxtransientjavaassemblecpu() {
        return pxtransientjavaassemblecpu;
    }

    public void setPxtransientjavaassemblecpu(BigDecimal pxtransientjavaassemblecpu) {
        this.pxtransientjavaassemblecpu = pxtransientjavaassemblecpu;
    }

    @Basic
    @Column(name = "pxtransientjavaassemblecount", nullable = true, precision = 0)
    public Integer getPxtransientjavaassemblecount() {
        return pxtransientjavaassemblecount;
    }

    public void setPxtransientjavaassemblecount(Integer pxtransientjavaassemblecount) {
        this.pxtransientjavaassemblecount = pxtransientjavaassemblecount;
    }

    @Basic
    @Column(name = "pxtransientjavaassembleelapsed", nullable = true, precision = 6)
    public BigDecimal getPxtransientjavaassembleelapsed() {
        return pxtransientjavaassembleelapsed;
    }

    public void setPxtransientjavaassembleelapsed(BigDecimal pxtransientjavaassembleelapsed) {
        this.pxtransientjavaassembleelapsed = pxtransientjavaassembleelapsed;
    }

    @Basic
    @Column(name = "pxtransientjavacompilecpu", nullable = true, precision = 6)
    public BigDecimal getPxtransientjavacompilecpu() {
        return pxtransientjavacompilecpu;
    }

    public void setPxtransientjavacompilecpu(BigDecimal pxtransientjavacompilecpu) {
        this.pxtransientjavacompilecpu = pxtransientjavacompilecpu;
    }

    @Basic
    @Column(name = "pxtransientjavacompilecount", nullable = true, precision = 0)
    public Integer getPxtransientjavacompilecount() {
        return pxtransientjavacompilecount;
    }

    public void setPxtransientjavacompilecount(Integer pxtransientjavacompilecount) {
        this.pxtransientjavacompilecount = pxtransientjavacompilecount;
    }

    @Basic
    @Column(name = "pxtransientjavacompileelapsed", nullable = true, precision = 6)
    public BigDecimal getPxtransientjavacompileelapsed() {
        return pxtransientjavacompileelapsed;
    }

    public void setPxtransientjavacompileelapsed(BigDecimal pxtransientjavacompileelapsed) {
        this.pxtransientjavacompileelapsed = pxtransientjavacompileelapsed;
    }

    @Basic
    @Column(name = "pxuseragent", nullable = true, length = 500)
    public String getPxuseragent() {
        return pxuseragent;
    }

    public void setPxuseragent(String pxuseragent) {
        this.pxuseragent = pxuseragent;
    }

    @Basic
    @Column(name = "pyuseridentifier", nullable = true, length = 128)
    public String getPyuseridentifier() {
        return pyuseridentifier;
    }

    public void setPyuseridentifier(String pyuseridentifier) {
        this.pyuseridentifier = pyuseridentifier;
    }

    @Id
    @Column(name = "pzinskey", nullable = false, length = 255)
    public String getPzinskey() {
        return pzinskey;
    }

    public void setPzinskey(String pzinskey) {
        this.pzinskey = pzinskey;
    }

    @Basic
    @Column(name = "pxclientloadelapsed", nullable = true, precision = 6)
    public BigDecimal getPxclientloadelapsed() {
        return pxclientloadelapsed;
    }

    public void setPxclientloadelapsed(BigDecimal pxclientloadelapsed) {
        this.pxclientloadelapsed = pxclientloadelapsed;
    }

    @Basic
    @Column(name = "pxclientloadcount", nullable = true, precision = 0)
    public Integer getPxclientloadcount() {
        return pxclientloadcount;
    }

    public void setPxclientloadcount(Integer pxclientloadcount) {
        this.pxclientloadcount = pxclientloadcount;
    }

    @Basic
    @Column(name = "pxadpcntxtsetuptimecpu", nullable = true, precision = 6)
    public BigDecimal getPxadpcntxtsetuptimecpu() {
        return pxadpcntxtsetuptimecpu;
    }

    public void setPxadpcntxtsetuptimecpu(BigDecimal pxadpcntxtsetuptimecpu) {
        this.pxadpcntxtsetuptimecpu = pxadpcntxtsetuptimecpu;
    }

    @Basic
    @Column(name = "pxadpcntxtsetuptimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxadpcntxtsetuptimeelapsed() {
        return pxadpcntxtsetuptimeelapsed;
    }

    public void setPxadpcntxtsetuptimeelapsed(BigDecimal pxadpcntxtsetuptimeelapsed) {
        this.pxadpcntxtsetuptimeelapsed = pxadpcntxtsetuptimeelapsed;
    }

    @Basic
    @Column(name = "pxadploadacttimecpu", nullable = true, precision = 6)
    public BigDecimal getPxadploadacttimecpu() {
        return pxadploadacttimecpu;
    }

    public void setPxadploadacttimecpu(BigDecimal pxadploadacttimecpu) {
        this.pxadploadacttimecpu = pxadploadacttimecpu;
    }

    @Basic
    @Column(name = "pxadploadacttimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxadploadacttimeelapsed() {
        return pxadploadacttimeelapsed;
    }

    public void setPxadploadacttimeelapsed(BigDecimal pxadploadacttimeelapsed) {
        this.pxadploadacttimeelapsed = pxadploadacttimeelapsed;
    }

    @Basic
    @Column(name = "pxadploadsusedcount", nullable = true, precision = 0)
    public Integer getPxadploadsusedcount() {
        return pxadploadsusedcount;
    }

    public void setPxadploadsusedcount(Integer pxadploadsusedcount) {
        this.pxadploadsusedcount = pxadploadsusedcount;
    }

    @Basic
    @Column(name = "pxadppagecopytimecpu", nullable = true, precision = 6)
    public BigDecimal getPxadppagecopytimecpu() {
        return pxadppagecopytimecpu;
    }

    public void setPxadppagecopytimecpu(BigDecimal pxadppagecopytimecpu) {
        this.pxadppagecopytimecpu = pxadppagecopytimecpu;
    }

    @Basic
    @Column(name = "pxadppagecopytimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxadppagecopytimeelapsed() {
        return pxadppagecopytimeelapsed;
    }

    public void setPxadppagecopytimeelapsed(BigDecimal pxadppagecopytimeelapsed) {
        this.pxadppagecopytimeelapsed = pxadppagecopytimeelapsed;
    }

    @Basic
    @Column(name = "pxadpqueuewaittimecpu", nullable = true, precision = 6)
    public BigDecimal getPxadpqueuewaittimecpu() {
        return pxadpqueuewaittimecpu;
    }

    public void setPxadpqueuewaittimecpu(BigDecimal pxadpqueuewaittimecpu) {
        this.pxadpqueuewaittimecpu = pxadpqueuewaittimecpu;
    }

    @Basic
    @Column(name = "pxadpqueuewaittimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxadpqueuewaittimeelapsed() {
        return pxadpqueuewaittimeelapsed;
    }

    public void setPxadpqueuewaittimeelapsed(BigDecimal pxadpqueuewaittimeelapsed) {
        this.pxadpqueuewaittimeelapsed = pxadpqueuewaittimeelapsed;
    }

    @Basic
    @Column(name = "pxadpwaittimecpu", nullable = true, precision = 6)
    public BigDecimal getPxadpwaittimecpu() {
        return pxadpwaittimecpu;
    }

    public void setPxadpwaittimecpu(BigDecimal pxadpwaittimecpu) {
        this.pxadpwaittimecpu = pxadpwaittimecpu;
    }

    @Basic
    @Column(name = "pxadpwaittimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxadpwaittimeelapsed() {
        return pxadpwaittimeelapsed;
    }

    public void setPxadpwaittimeelapsed(BigDecimal pxadpwaittimeelapsed) {
        this.pxadpwaittimeelapsed = pxadpwaittimeelapsed;
    }

    @Basic
    @Column(name = "pxchildreqcount", nullable = true, precision = 0)
    public Integer getPxchildreqcount() {
        return pxchildreqcount;
    }

    public void setPxchildreqcount(Integer pxchildreqcount) {
        this.pxchildreqcount = pxchildreqcount;
    }

    @Basic
    @Column(name = "pxchildwaitelapsed", nullable = true, precision = 6)
    public BigDecimal getPxchildwaitelapsed() {
        return pxchildwaitelapsed;
    }

    public void setPxchildwaitelapsed(BigDecimal pxchildwaitelapsed) {
        this.pxchildwaitelapsed = pxchildwaitelapsed;
    }

    @Basic
    @Column(name = "pxcnctclientresponseelapsed", nullable = true, precision = 6)
    public BigDecimal getPxcnctclientresponseelapsed() {
        return pxcnctclientresponseelapsed;
    }

    public void setPxcnctclientresponseelapsed(BigDecimal pxcnctclientresponseelapsed) {
        this.pxcnctclientresponseelapsed = pxcnctclientresponseelapsed;
    }

    @Basic
    @Column(name = "pxcnctclientresponseelapsedcpu", nullable = true, precision = 6)
    public BigDecimal getPxcnctclientresponseelapsedcpu() {
        return pxcnctclientresponseelapsedcpu;
    }

    public void setPxcnctclientresponseelapsedcpu(BigDecimal pxcnctclientresponseelapsedcpu) {
        this.pxcnctclientresponseelapsedcpu = pxcnctclientresponseelapsedcpu;
    }

    @Basic
    @Column(name = "pxcnctinmapreqelapsed", nullable = true, precision = 6)
    public BigDecimal getPxcnctinmapreqelapsed() {
        return pxcnctinmapreqelapsed;
    }

    public void setPxcnctinmapreqelapsed(BigDecimal pxcnctinmapreqelapsed) {
        this.pxcnctinmapreqelapsed = pxcnctinmapreqelapsed;
    }

    @Basic
    @Column(name = "pxcnctinmapreqcpu", nullable = true, precision = 6)
    public BigDecimal getPxcnctinmapreqcpu() {
        return pxcnctinmapreqcpu;
    }

    public void setPxcnctinmapreqcpu(BigDecimal pxcnctinmapreqcpu) {
        this.pxcnctinmapreqcpu = pxcnctinmapreqcpu;
    }

    @Basic
    @Column(name = "pxcnctoutmapreqcpu", nullable = true, precision = 6)
    public BigDecimal getPxcnctoutmapreqcpu() {
        return pxcnctoutmapreqcpu;
    }

    public void setPxcnctoutmapreqcpu(BigDecimal pxcnctoutmapreqcpu) {
        this.pxcnctoutmapreqcpu = pxcnctoutmapreqcpu;
    }

    @Basic
    @Column(name = "pxcnctoutmapreqelapsed", nullable = true, precision = 6)
    public BigDecimal getPxcnctoutmapreqelapsed() {
        return pxcnctoutmapreqelapsed;
    }

    public void setPxcnctoutmapreqelapsed(BigDecimal pxcnctoutmapreqelapsed) {
        this.pxcnctoutmapreqelapsed = pxcnctoutmapreqelapsed;
    }

    @Basic
    @Column(name = "pxdeclpagecount", nullable = true, precision = 0)
    public Integer getPxdeclpagecount() {
        return pxdeclpagecount;
    }

    public void setPxdeclpagecount(Integer pxdeclpagecount) {
        this.pxdeclpagecount = pxdeclpagecount;
    }

    @Basic
    @Column(name = "pxdeclpageloadcount", nullable = true, precision = 0)
    public Integer getPxdeclpageloadcount() {
        return pxdeclpageloadcount;
    }

    public void setPxdeclpageloadcount(Integer pxdeclpageloadcount) {
        this.pxdeclpageloadcount = pxdeclpageloadcount;
    }

    @Basic
    @Column(name = "pxdeclpageloadcpu", nullable = true, precision = 6)
    public BigDecimal getPxdeclpageloadcpu() {
        return pxdeclpageloadcpu;
    }

    public void setPxdeclpageloadcpu(BigDecimal pxdeclpageloadcpu) {
        this.pxdeclpageloadcpu = pxdeclpageloadcpu;
    }

    @Basic
    @Column(name = "pxdeclpageloadelapsed", nullable = true, precision = 6)
    public BigDecimal getPxdeclpageloadelapsed() {
        return pxdeclpageloadelapsed;
    }

    public void setPxdeclpageloadelapsed(BigDecimal pxdeclpageloadelapsed) {
        this.pxdeclpageloadelapsed = pxdeclpageloadelapsed;
    }

    @Basic
    @Column(name = "pxfuacachedbloadcpu", nullable = true, precision = 6)
    public BigDecimal getPxfuacachedbloadcpu() {
        return pxfuacachedbloadcpu;
    }

    public void setPxfuacachedbloadcpu(BigDecimal pxfuacachedbloadcpu) {
        this.pxfuacachedbloadcpu = pxfuacachedbloadcpu;
    }

    @Basic
    @Column(name = "pxfuacachedbloadelapsed", nullable = true, precision = 6)
    public BigDecimal getPxfuacachedbloadelapsed() {
        return pxfuacachedbloadelapsed;
    }

    public void setPxfuacachedbloadelapsed(BigDecimal pxfuacachedbloadelapsed) {
        this.pxfuacachedbloadelapsed = pxfuacachedbloadelapsed;
    }

    @Basic
    @Column(name = "pxfuawritetodbtimecpu", nullable = true, precision = 6)
    public BigDecimal getPxfuawritetodbtimecpu() {
        return pxfuawritetodbtimecpu;
    }

    public void setPxfuawritetodbtimecpu(BigDecimal pxfuawritetodbtimecpu) {
        this.pxfuawritetodbtimecpu = pxfuawritetodbtimecpu;
    }

    @Basic
    @Column(name = "pxfuawritetodbtimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxfuawritetodbtimeelapsed() {
        return pxfuawritetodbtimeelapsed;
    }

    public void setPxfuawritetodbtimeelapsed(BigDecimal pxfuawritetodbtimeelapsed) {
        this.pxfuawritetodbtimeelapsed = pxfuawritetodbtimeelapsed;
    }

    @Basic
    @Column(name = "pxinfergeneratedjavahlcpu", nullable = true, precision = 6)
    public BigDecimal getPxinfergeneratedjavahlcpu() {
        return pxinfergeneratedjavahlcpu;
    }

    public void setPxinfergeneratedjavahlcpu(BigDecimal pxinfergeneratedjavahlcpu) {
        this.pxinfergeneratedjavahlcpu = pxinfergeneratedjavahlcpu;
    }

    @Basic
    @Column(name = "pxjavaassemblehlcpu", nullable = true, precision = 6)
    public BigDecimal getPxjavaassemblehlcpu() {
        return pxjavaassemblehlcpu;
    }

    public void setPxjavaassemblehlcpu(BigDecimal pxjavaassemblehlcpu) {
        this.pxjavaassemblehlcpu = pxjavaassemblehlcpu;
    }

    @Basic
    @Column(name = "pxtrackerreporttimecpu", nullable = true, precision = 6)
    public BigDecimal getPxtrackerreporttimecpu() {
        return pxtrackerreporttimecpu;
    }

    public void setPxtrackerreporttimecpu(BigDecimal pxtrackerreporttimecpu) {
        this.pxtrackerreporttimecpu = pxtrackerreporttimecpu;
    }

    @Basic
    @Column(name = "pxtrackerreporttimeelapsed", nullable = true, precision = 6)
    public BigDecimal getPxtrackerreporttimeelapsed() {
        return pxtrackerreporttimeelapsed;
    }

    public void setPxtrackerreporttimeelapsed(BigDecimal pxtrackerreporttimeelapsed) {
        this.pxtrackerreporttimeelapsed = pxtrackerreporttimeelapsed;
    }

    @Basic
    @Column(name = "pxexceptioncount", nullable = true, precision = 0)
    public Integer getPxexceptioncount() {
        return pxexceptioncount;
    }

    public void setPxexceptioncount(Integer pxexceptioncount) {
        this.pxexceptioncount = pxexceptioncount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrPerfStatsEntity that = (PrPerfStatsEntity) o;

        if (pxcommitdatetime != null ? !pxcommitdatetime.equals(that.pxcommitdatetime) : that.pxcommitdatetime != null)
            return false;
        if (pxsavedatetime != null ? !pxsavedatetime.equals(that.pxsavedatetime) : that.pxsavedatetime != null)
            return false;
        if (pxactivationdatatimecpu != null ? !pxactivationdatatimecpu.equals(that.pxactivationdatatimecpu) : that.pxactivationdatatimecpu != null)
            return false;
        if (pxactivationdatatimeelapsed != null ? !pxactivationdatatimeelapsed.equals(that.pxactivationdatatimeelapsed) : that.pxactivationdatatimeelapsed != null)
            return false;
        if (pxactivitycount != null ? !pxactivitycount.equals(that.pxactivitycount) : that.pxactivitycount != null)
            return false;
        if (pxalertcount != null ? !pxalertcount.equals(that.pxalertcount) : that.pxalertcount != null) return false;
        if (pxapplication != null ? !pxapplication.equals(that.pxapplication) : that.pxapplication != null)
            return false;
        if (pxcheckout != null ? !pxcheckout.equals(that.pxcheckout) : that.pxcheckout != null) return false;
        if (pxcommitcount != null ? !pxcommitcount.equals(that.pxcommitcount) : that.pxcommitcount != null)
            return false;
        if (pxcommitelapsed != null ? !pxcommitelapsed.equals(that.pxcommitelapsed) : that.pxcommitelapsed != null)
            return false;
        if (pxcommitrowcount != null ? !pxcommitrowcount.equals(that.pxcommitrowcount) : that.pxcommitrowcount != null)
            return false;
        if (pxconnectcount != null ? !pxconnectcount.equals(that.pxconnectcount) : that.pxconnectcount != null)
            return false;
        if (pxconnectelapsed != null ? !pxconnectelapsed.equals(that.pxconnectelapsed) : that.pxconnectelapsed != null)
            return false;
        if (pxdbinputbytes != null ? !pxdbinputbytes.equals(that.pxdbinputbytes) : that.pxdbinputbytes != null)
            return false;
        if (pxdbopexceedingthresholdcount != null ? !pxdbopexceedingthresholdcount.equals(that.pxdbopexceedingthresholdcount) : that.pxdbopexceedingthresholdcount != null)
            return false;
        if (pxdboutputbytes != null ? !pxdboutputbytes.equals(that.pxdboutputbytes) : that.pxdboutputbytes != null)
            return false;
        if (pxdeclarativerulereadcount != null ? !pxdeclarativerulereadcount.equals(that.pxdeclarativerulereadcount) : that.pxdeclarativerulereadcount != null)
            return false;
        if (pxdeclarativerulesinvokedcpu != null ? !pxdeclarativerulesinvokedcpu.equals(that.pxdeclarativerulesinvokedcpu) : that.pxdeclarativerulesinvokedcpu != null)
            return false;
        if (pxdeclarativerulesinvokedcount != null ? !pxdeclarativerulesinvokedcount.equals(that.pxdeclarativerulesinvokedcount) : that.pxdeclarativerulesinvokedcount != null)
            return false;
        if (pxdeclarativeruleslookupcpu != null ? !pxdeclarativeruleslookupcpu.equals(that.pxdeclarativeruleslookupcpu) : that.pxdeclarativeruleslookupcpu != null)
            return false;
        if (pxdeclarativeruleslookupcount != null ? !pxdeclarativeruleslookupcount.equals(that.pxdeclarativeruleslookupcount) : that.pxdeclarativeruleslookupcount != null)
            return false;
        if (pxdeclexprctxfreeusecount != null ? !pxdeclexprctxfreeusecount.equals(that.pxdeclexprctxfreeusecount) : that.pxdeclexprctxfreeusecount != null)
            return false;
        if (pxdeclexprctxsensusecount != null ? !pxdeclexprctxsensusecount.equals(that.pxdeclexprctxsensusecount) : that.pxdeclexprctxsensusecount != null)
            return false;
        if (pxdeclntwksbuildhlelap != null ? !pxdeclntwksbuildhlelap.equals(that.pxdeclntwksbuildhlelap) : that.pxdeclntwksbuildhlelap != null)
            return false;
        if (pxdeclntwksbuildhlcpu != null ? !pxdeclntwksbuildhlcpu.equals(that.pxdeclntwksbuildhlcpu) : that.pxdeclntwksbuildhlcpu != null)
            return false;
        if (pxdeclntwksbuildconstelapsed != null ? !pxdeclntwksbuildconstelapsed.equals(that.pxdeclntwksbuildconstelapsed) : that.pxdeclntwksbuildconstelapsed != null)
            return false;
        if (pxdeclntwksbuildconstcpu != null ? !pxdeclntwksbuildconstcpu.equals(that.pxdeclntwksbuildconstcpu) : that.pxdeclntwksbuildconstcpu != null)
            return false;
        if (pxdeclrulesinvokedelapsed != null ? !pxdeclrulesinvokedelapsed.equals(that.pxdeclrulesinvokedelapsed) : that.pxdeclrulesinvokedelapsed != null)
            return false;
        if (pxdeclrulesinvokedbckgrdcnt != null ? !pxdeclrulesinvokedbckgrdcnt.equals(that.pxdeclrulesinvokedbckgrdcnt) : that.pxdeclrulesinvokedbckgrdcnt != null)
            return false;
        if (pxdeclruleslookupelapsed != null ? !pxdeclruleslookupelapsed.equals(that.pxdeclruleslookupelapsed) : that.pxdeclruleslookupelapsed != null)
            return false;
        if (pxdecryptcount != null ? !pxdecryptcount.equals(that.pxdecryptcount) : that.pxdecryptcount != null)
            return false;
        if (pxdecryptcpu != null ? !pxdecryptcpu.equals(that.pxdecryptcpu) : that.pxdecryptcpu != null) return false;
        if (pxdecryptelapsed != null ? !pxdecryptelapsed.equals(that.pxdecryptelapsed) : that.pxdecryptelapsed != null)
            return false;
        if (pxencodedrulesets != null ? !pxencodedrulesets.equals(that.pxencodedrulesets) : that.pxencodedrulesets != null)
            return false;
        if (pxencryptcount != null ? !pxencryptcount.equals(that.pxencryptcount) : that.pxencryptcount != null)
            return false;
        if (pxencryptcpu != null ? !pxencryptcpu.equals(that.pxencryptcpu) : that.pxencryptcpu != null) return false;
        if (pxencryptelapsed != null ? !pxencryptelapsed.equals(that.pxencryptelapsed) : that.pxencryptelapsed != null)
            return false;
        if (pxflowcount != null ? !pxflowcount.equals(that.pxflowcount) : that.pxflowcount != null) return false;
        if (pxindexcount != null ? !pxindexcount.equals(that.pxindexcount) : that.pxindexcount != null) return false;
        if (pxinfergeneratedjavacount != null ? !pxinfergeneratedjavacount.equals(that.pxinfergeneratedjavacount) : that.pxinfergeneratedjavacount != null)
            return false;
        if (pxinfergeneratedjavacpu != null ? !pxinfergeneratedjavacpu.equals(that.pxinfergeneratedjavacpu) : that.pxinfergeneratedjavacpu != null)
            return false;
        if (pxinfergeneratedjavaelapsed != null ? !pxinfergeneratedjavaelapsed.equals(that.pxinfergeneratedjavaelapsed) : that.pxinfergeneratedjavaelapsed != null)
            return false;
        if (pxinfergeneratedjavahlelapsed != null ? !pxinfergeneratedjavahlelapsed.equals(that.pxinfergeneratedjavahlelapsed) : that.pxinfergeneratedjavahlelapsed != null)
            return false;
        if (pxinputbytes != null ? !pxinputbytes.equals(that.pxinputbytes) : that.pxinputbytes != null) return false;
        if (pxinsname != null ? !pxinsname.equals(that.pxinsname) : that.pxinsname != null) return false;
        if (pxinteractions != null ? !pxinteractions.equals(that.pxinteractions) : that.pxinteractions != null)
            return false;
        if (pxjavaassemblecpu != null ? !pxjavaassemblecpu.equals(that.pxjavaassemblecpu) : that.pxjavaassemblecpu != null)
            return false;
        if (pxjavaassemblecount != null ? !pxjavaassemblecount.equals(that.pxjavaassemblecount) : that.pxjavaassemblecount != null)
            return false;
        if (pxjavaassembleelapsed != null ? !pxjavaassembleelapsed.equals(that.pxjavaassembleelapsed) : that.pxjavaassembleelapsed != null)
            return false;
        if (pxjavaassemblehlelapsed != null ? !pxjavaassemblehlelapsed.equals(that.pxjavaassemblehlelapsed) : that.pxjavaassemblehlelapsed != null)
            return false;
        if (pxjavacompilecpu != null ? !pxjavacompilecpu.equals(that.pxjavacompilecpu) : that.pxjavacompilecpu != null)
            return false;
        if (pxjavacompilecount != null ? !pxjavacompilecount.equals(that.pxjavacompilecount) : that.pxjavacompilecount != null)
            return false;
        if (pxjavacompileelapsed != null ? !pxjavacompileelapsed.equals(that.pxjavacompileelapsed) : that.pxjavacompileelapsed != null)
            return false;
        if (pxjavageneratecpu != null ? !pxjavageneratecpu.equals(that.pxjavageneratecpu) : that.pxjavageneratecpu != null)
            return false;
        if (pxjavageneratecount != null ? !pxjavageneratecount.equals(that.pxjavageneratecount) : that.pxjavageneratecount != null)
            return false;
        if (pxjavagenerateelapsed != null ? !pxjavagenerateelapsed.equals(that.pxjavagenerateelapsed) : that.pxjavagenerateelapsed != null)
            return false;
        if (pxjavastepcpu != null ? !pxjavastepcpu.equals(that.pxjavastepcpu) : that.pxjavastepcpu != null)
            return false;
        if (pxjavastepcount != null ? !pxjavastepcount.equals(that.pxjavastepcount) : that.pxjavastepcount != null)
            return false;
        if (pxjavastepelapsed != null ? !pxjavastepelapsed.equals(that.pxjavastepelapsed) : that.pxjavastepelapsed != null)
            return false;
        if (pxjavasyntaxcpu != null ? !pxjavasyntaxcpu.equals(that.pxjavasyntaxcpu) : that.pxjavasyntaxcpu != null)
            return false;
        if (pxjavasyntaxcount != null ? !pxjavasyntaxcount.equals(that.pxjavasyntaxcount) : that.pxjavasyntaxcount != null)
            return false;
        if (pxjavasyntaxelapsed != null ? !pxjavasyntaxelapsed.equals(that.pxjavasyntaxelapsed) : that.pxjavasyntaxelapsed != null)
            return false;
        if (pxlegacyruleapiusedcount != null ? !pxlegacyruleapiusedcount.equals(that.pxlegacyruleapiusedcount) : that.pxlegacyruleapiusedcount != null)
            return false;
        if (pxlistrowwithfilteredstrmcnt != null ? !pxlistrowwithfilteredstrmcnt.equals(that.pxlistrowwithfilteredstrmcnt) : that.pxlistrowwithfilteredstrmcnt != null)
            return false;
        if (pxlistrowwithunfilteredstrmcnt != null ? !pxlistrowwithunfilteredstrmcnt.equals(that.pxlistrowwithunfilteredstrmcnt) : that.pxlistrowwithunfilteredstrmcnt != null)
            return false;
        if (pxlistrowwithoutstreamcount != null ? !pxlistrowwithoutstreamcount.equals(that.pxlistrowwithoutstreamcount) : that.pxlistrowwithoutstreamcount != null)
            return false;
        if (pxlistwithfilteredstreamcount != null ? !pxlistwithfilteredstreamcount.equals(that.pxlistwithfilteredstreamcount) : that.pxlistwithfilteredstreamcount != null)
            return false;
        if (pxlistwithunfilteredstrmcnt != null ? !pxlistwithunfilteredstrmcnt.equals(that.pxlistwithunfilteredstrmcnt) : that.pxlistwithunfilteredstrmcnt != null)
            return false;
        if (pxlistwithoutstreamcount != null ? !pxlistwithoutstreamcount.equals(that.pxlistwithoutstreamcount) : that.pxlistwithoutstreamcount != null)
            return false;
        if (pxlookuplistdbfetches != null ? !pxlookuplistdbfetches.equals(that.pxlookuplistdbfetches) : that.pxlookuplistdbfetches != null)
            return false;
        if (pxnewfuainstances != null ? !pxnewfuainstances.equals(that.pxnewfuainstances) : that.pxnewfuainstances != null)
            return false;
        if (pxobjclass != null ? !pxobjclass.equals(that.pxobjclass) : that.pxobjclass != null) return false;
        if (pxotherbrowsecpu != null ? !pxotherbrowsecpu.equals(that.pxotherbrowsecpu) : that.pxotherbrowsecpu != null)
            return false;
        if (pxotherbrowseelapsed != null ? !pxotherbrowseelapsed.equals(that.pxotherbrowseelapsed) : that.pxotherbrowseelapsed != null)
            return false;
        if (pxotherbrowsefiltercpu != null ? !pxotherbrowsefiltercpu.equals(that.pxotherbrowsefiltercpu) : that.pxotherbrowsefiltercpu != null)
            return false;
        if (pxotherbrowsefiltercnt != null ? !pxotherbrowsefiltercnt.equals(that.pxotherbrowsefiltercnt) : that.pxotherbrowsefiltercnt != null)
            return false;
        if (pxotherbrowsefilterelapsed != null ? !pxotherbrowsefilterelapsed.equals(that.pxotherbrowsefilterelapsed) : that.pxotherbrowsefilterelapsed != null)
            return false;
        if (pxotherbrowsereturned != null ? !pxotherbrowsereturned.equals(that.pxotherbrowsereturned) : that.pxotherbrowsereturned != null)
            return false;
        if (pxothercount != null ? !pxothercount.equals(that.pxothercount) : that.pxothercount != null) return false;
        if (pxotherfromcachecount != null ? !pxotherfromcachecount.equals(that.pxotherfromcachecount) : that.pxotherfromcachecount != null)
            return false;
        if (pxotheriocpu != null ? !pxotheriocpu.equals(that.pxotheriocpu) : that.pxotheriocpu != null) return false;
        if (pxotheriocount != null ? !pxotheriocount.equals(that.pxotheriocount) : that.pxotheriocount != null)
            return false;
        if (pxotherioelapsed != null ? !pxotherioelapsed.equals(that.pxotherioelapsed) : that.pxotherioelapsed != null)
            return false;
        if (pxoutputbytes != null ? !pxoutputbytes.equals(that.pxoutputbytes) : that.pxoutputbytes != null)
            return false;
        if (pxparserulecount != null ? !pxparserulecount.equals(that.pxparserulecount) : that.pxparserulecount != null)
            return false;
        if (pxparseruletime != null ? !pxparseruletime.equals(that.pxparseruletime) : that.pxparseruletime != null)
            return false;
        if (pxparseruletimecpu != null ? !pxparseruletimecpu.equals(that.pxparseruletimecpu) : that.pxparseruletimecpu != null)
            return false;
        if (pxpassivationcount != null ? !pxpassivationcount.equals(that.pxpassivationcount) : that.pxpassivationcount != null)
            return false;
        if (pxpassivationdatatimecpu != null ? !pxpassivationdatatimecpu.equals(that.pxpassivationdatatimecpu) : that.pxpassivationdatatimecpu != null)
            return false;
        if (pxpassivationdatatimeelapsed != null ? !pxpassivationdatatimeelapsed.equals(that.pxpassivationdatatimeelapsed) : that.pxpassivationdatatimeelapsed != null)
            return false;
        if (pxpassivationidletimeelapsed != null ? !pxpassivationidletimeelapsed.equals(that.pxpassivationidletimeelapsed) : that.pxpassivationidletimeelapsed != null)
            return false;
        if (pxpassivationsizeaverage != null ? !pxpassivationsizeaverage.equals(that.pxpassivationsizeaverage) : that.pxpassivationsizeaverage != null)
            return false;
        if (pxpassivationsizelast != null ? !pxpassivationsizelast.equals(that.pxpassivationsizelast) : that.pxpassivationsizelast != null)
            return false;
        if (pxpassivationsizepeak != null ? !pxpassivationsizepeak.equals(that.pxpassivationsizepeak) : that.pxpassivationsizepeak != null)
            return false;
        if (pxproceduralrulereadcount != null ? !pxproceduralrulereadcount.equals(that.pxproceduralrulereadcount) : that.pxproceduralrulereadcount != null)
            return false;
        if (pxprocesscpu != null ? !pxprocesscpu.equals(that.pxprocesscpu) : that.pxprocesscpu != null) return false;
        if (pxproclabel != null ? !pxproclabel.equals(that.pxproclabel) : that.pxproclabel != null) return false;
        if (pxpropertyreadcount != null ? !pxpropertyreadcount.equals(that.pxpropertyreadcount) : that.pxpropertyreadcount != null)
            return false;
        if (pxrdbiocount != null ? !pxrdbiocount.equals(that.pxrdbiocount) : that.pxrdbiocount != null) return false;
        if (pxrdbioelapsed != null ? !pxrdbioelapsed.equals(that.pxrdbioelapsed) : that.pxrdbioelapsed != null)
            return false;
        if (pxrdbrowwithstreamcount != null ? !pxrdbrowwithstreamcount.equals(that.pxrdbrowwithstreamcount) : that.pxrdbrowwithstreamcount != null)
            return false;
        if (pxrdbrowwithoutstreamcount != null ? !pxrdbrowwithoutstreamcount.equals(that.pxrdbrowwithoutstreamcount) : that.pxrdbrowwithoutstreamcount != null)
            return false;
        if (pxrdbwithstreamcount != null ? !pxrdbwithstreamcount.equals(that.pxrdbwithstreamcount) : that.pxrdbwithstreamcount != null)
            return false;
        if (pxrdbwithoutstreamcount != null ? !pxrdbwithoutstreamcount.equals(that.pxrdbwithoutstreamcount) : that.pxrdbwithoutstreamcount != null)
            return false;
        if (pxreferencepropertyusecpu != null ? !pxreferencepropertyusecpu.equals(that.pxreferencepropertyusecpu) : that.pxreferencepropertyusecpu != null)
            return false;
        if (pxreferencepropertyusecount != null ? !pxreferencepropertyusecount.equals(that.pxreferencepropertyusecount) : that.pxreferencepropertyusecount != null)
            return false;
        if (pxreferencepropertyuseelapsed != null ? !pxreferencepropertyuseelapsed.equals(that.pxreferencepropertyuseelapsed) : that.pxreferencepropertyuseelapsed != null)
            return false;
        if (pxrequestorid != null ? !pxrequestorid.equals(that.pxrequestorid) : that.pxrequestorid != null)
            return false;
        if (pxrequestorstart != null ? !pxrequestorstart.equals(that.pxrequestorstart) : that.pxrequestorstart != null)
            return false;
        if (pxrequestortype != null ? !pxrequestortype.equals(that.pxrequestortype) : that.pxrequestortype != null)
            return false;
        if (pxrulebrowsecpu != null ? !pxrulebrowsecpu.equals(that.pxrulebrowsecpu) : that.pxrulebrowsecpu != null)
            return false;
        if (pxrulebrowseelapsed != null ? !pxrulebrowseelapsed.equals(that.pxrulebrowseelapsed) : that.pxrulebrowseelapsed != null)
            return false;
        if (pxrulebrowsefiltercpu != null ? !pxrulebrowsefiltercpu.equals(that.pxrulebrowsefiltercpu) : that.pxrulebrowsefiltercpu != null)
            return false;
        if (pxrulebrowsefiltercnt != null ? !pxrulebrowsefiltercnt.equals(that.pxrulebrowsefiltercnt) : that.pxrulebrowsefiltercnt != null)
            return false;
        if (pxrulebrowsefilterelapsed != null ? !pxrulebrowsefilterelapsed.equals(that.pxrulebrowsefilterelapsed) : that.pxrulebrowsefilterelapsed != null)
            return false;
        if (pxrulebrowsereturned != null ? !pxrulebrowsereturned.equals(that.pxrulebrowsereturned) : that.pxrulebrowsereturned != null)
            return false;
        if (pxrulecpu != null ? !pxrulecpu.equals(that.pxrulecpu) : that.pxrulecpu != null) return false;
        if (pxrulecount != null ? !pxrulecount.equals(that.pxrulecount) : that.pxrulecount != null) return false;
        if (pxrulefromcachecount != null ? !pxrulefromcachecount.equals(that.pxrulefromcachecount) : that.pxrulefromcachecount != null)
            return false;
        if (pxruleioelapsed != null ? !pxruleioelapsed.equals(that.pxruleioelapsed) : that.pxruleioelapsed != null)
            return false;
        if (pxrulesexecuted != null ? !pxrulesexecuted.equals(that.pxrulesexecuted) : that.pxrulesexecuted != null)
            return false;
        if (pxrulesused != null ? !pxrulesused.equals(that.pxrulesused) : that.pxrulesused != null) return false;
        if (pxrunmodelcount != null ? !pxrunmodelcount.equals(that.pxrunmodelcount) : that.pxrunmodelcount != null)
            return false;
        if (pxrunotherrulecount != null ? !pxrunotherrulecount.equals(that.pxrunotherrulecount) : that.pxrunotherrulecount != null)
            return false;
        if (pxrunstreamcount != null ? !pxrunstreamcount.equals(that.pxrunstreamcount) : that.pxrunstreamcount != null)
            return false;
        if (pxrunwhencount != null ? !pxrunwhencount.equals(that.pxrunwhencount) : that.pxrunwhencount != null)
            return false;
        if (pxsavedcbafterintcount != null ? !pxsavedcbafterintcount.equals(that.pxsavedcbafterintcount) : that.pxsavedcbafterintcount != null)
            return false;
        if (pxsavedcbafterintcpu != null ? !pxsavedcbafterintcpu.equals(that.pxsavedcbafterintcpu) : that.pxsavedcbafterintcpu != null)
            return false;
        if (pxsavedcbafterintelapsed != null ? !pxsavedcbafterintelapsed.equals(that.pxsavedcbafterintelapsed) : that.pxsavedcbafterintelapsed != null)
            return false;
        if (pxsavedcxtafterintcpu != null ? !pxsavedcxtafterintcpu.equals(that.pxsavedcxtafterintcpu) : that.pxsavedcxtafterintcpu != null)
            return false;
        if (pxsavedcxtafterintcount != null ? !pxsavedcxtafterintcount.equals(that.pxsavedcxtafterintcount) : that.pxsavedcxtafterintcount != null)
            return false;
        if (pxsavedcxtafterintelapsed != null ? !pxsavedcxtafterintelapsed.equals(that.pxsavedcxtafterintelapsed) : that.pxsavedcxtafterintelapsed != null)
            return false;
        if (pxserviceactivitycpu != null ? !pxserviceactivitycpu.equals(that.pxserviceactivitycpu) : that.pxserviceactivitycpu != null)
            return false;
        if (pxserviceactivitytime != null ? !pxserviceactivitytime.equals(that.pxserviceactivitytime) : that.pxserviceactivitytime != null)
            return false;
        if (pxservicecount != null ? !pxservicecount.equals(that.pxservicecount) : that.pxservicecount != null)
            return false;
        if (pxservicedatavolume != null ? !pxservicedatavolume.equals(that.pxservicedatavolume) : that.pxservicedatavolume != null)
            return false;
        if (pxserviceinmapreqcpu != null ? !pxserviceinmapreqcpu.equals(that.pxserviceinmapreqcpu) : that.pxserviceinmapreqcpu != null)
            return false;
        if (pxserviceinmapreqtime != null ? !pxserviceinmapreqtime.equals(that.pxserviceinmapreqtime) : that.pxserviceinmapreqtime != null)
            return false;
        if (pxservicenumfilerecords != null ? !pxservicenumfilerecords.equals(that.pxservicenumfilerecords) : that.pxservicenumfilerecords != null)
            return false;
        if (pxserviceoutmapreqcpu != null ? !pxserviceoutmapreqcpu.equals(that.pxserviceoutmapreqcpu) : that.pxserviceoutmapreqcpu != null)
            return false;
        if (pxserviceoutmapreqtime != null ? !pxserviceoutmapreqtime.equals(that.pxserviceoutmapreqtime) : that.pxserviceoutmapreqtime != null)
            return false;
        if (pxsnapshottime != null ? !pxsnapshottime.equals(that.pxsnapshottime) : that.pxsnapshottime != null)
            return false;
        if (pxsnapshottype != null ? !pxsnapshottype.equals(that.pxsnapshottype) : that.pxsnapshottype != null)
            return false;
        if (pxstreamtimecpu != null ? !pxstreamtimecpu.equals(that.pxstreamtimecpu) : that.pxstreamtimecpu != null)
            return false;
        if (pxstreamtimeelapsed != null ? !pxstreamtimeelapsed.equals(that.pxstreamtimeelapsed) : that.pxstreamtimeelapsed != null)
            return false;
        if (pxsystemname != null ? !pxsystemname.equals(that.pxsystemname) : that.pxsystemname != null) return false;
        if (pxsystemnode != null ? !pxsystemnode.equals(that.pxsystemnode) : that.pxsystemnode != null) return false;
        if (pxsystemnodeid != null ? !pxsystemnodeid.equals(that.pxsystemnodeid) : that.pxsystemnodeid != null)
            return false;
        if (pxsystemstart != null ? !pxsystemstart.equals(that.pxsystemstart) : that.pxsystemstart != null)
            return false;
        if (pxtotalreqcpu != null ? !pxtotalreqcpu.equals(that.pxtotalreqcpu) : that.pxtotalreqcpu != null)
            return false;
        if (pxtotalreqtime != null ? !pxtotalreqtime.equals(that.pxtotalreqtime) : that.pxtotalreqtime != null)
            return false;
        if (pxtrackedpropertychangescount != null ? !pxtrackedpropertychangescount.equals(that.pxtrackedpropertychangescount) : that.pxtrackedpropertychangescount != null)
            return false;
        if (pxtransientjavaassemblecpu != null ? !pxtransientjavaassemblecpu.equals(that.pxtransientjavaassemblecpu) : that.pxtransientjavaassemblecpu != null)
            return false;
        if (pxtransientjavaassemblecount != null ? !pxtransientjavaassemblecount.equals(that.pxtransientjavaassemblecount) : that.pxtransientjavaassemblecount != null)
            return false;
        if (pxtransientjavaassembleelapsed != null ? !pxtransientjavaassembleelapsed.equals(that.pxtransientjavaassembleelapsed) : that.pxtransientjavaassembleelapsed != null)
            return false;
        if (pxtransientjavacompilecpu != null ? !pxtransientjavacompilecpu.equals(that.pxtransientjavacompilecpu) : that.pxtransientjavacompilecpu != null)
            return false;
        if (pxtransientjavacompilecount != null ? !pxtransientjavacompilecount.equals(that.pxtransientjavacompilecount) : that.pxtransientjavacompilecount != null)
            return false;
        if (pxtransientjavacompileelapsed != null ? !pxtransientjavacompileelapsed.equals(that.pxtransientjavacompileelapsed) : that.pxtransientjavacompileelapsed != null)
            return false;
        if (pxuseragent != null ? !pxuseragent.equals(that.pxuseragent) : that.pxuseragent != null) return false;
        if (pyuseridentifier != null ? !pyuseridentifier.equals(that.pyuseridentifier) : that.pyuseridentifier != null)
            return false;
        if (pzinskey != null ? !pzinskey.equals(that.pzinskey) : that.pzinskey != null) return false;
        if (pxclientloadelapsed != null ? !pxclientloadelapsed.equals(that.pxclientloadelapsed) : that.pxclientloadelapsed != null)
            return false;
        if (pxclientloadcount != null ? !pxclientloadcount.equals(that.pxclientloadcount) : that.pxclientloadcount != null)
            return false;
        if (pxadpcntxtsetuptimecpu != null ? !pxadpcntxtsetuptimecpu.equals(that.pxadpcntxtsetuptimecpu) : that.pxadpcntxtsetuptimecpu != null)
            return false;
        if (pxadpcntxtsetuptimeelapsed != null ? !pxadpcntxtsetuptimeelapsed.equals(that.pxadpcntxtsetuptimeelapsed) : that.pxadpcntxtsetuptimeelapsed != null)
            return false;
        if (pxadploadacttimecpu != null ? !pxadploadacttimecpu.equals(that.pxadploadacttimecpu) : that.pxadploadacttimecpu != null)
            return false;
        if (pxadploadacttimeelapsed != null ? !pxadploadacttimeelapsed.equals(that.pxadploadacttimeelapsed) : that.pxadploadacttimeelapsed != null)
            return false;
        if (pxadploadsusedcount != null ? !pxadploadsusedcount.equals(that.pxadploadsusedcount) : that.pxadploadsusedcount != null)
            return false;
        if (pxadppagecopytimecpu != null ? !pxadppagecopytimecpu.equals(that.pxadppagecopytimecpu) : that.pxadppagecopytimecpu != null)
            return false;
        if (pxadppagecopytimeelapsed != null ? !pxadppagecopytimeelapsed.equals(that.pxadppagecopytimeelapsed) : that.pxadppagecopytimeelapsed != null)
            return false;
        if (pxadpqueuewaittimecpu != null ? !pxadpqueuewaittimecpu.equals(that.pxadpqueuewaittimecpu) : that.pxadpqueuewaittimecpu != null)
            return false;
        if (pxadpqueuewaittimeelapsed != null ? !pxadpqueuewaittimeelapsed.equals(that.pxadpqueuewaittimeelapsed) : that.pxadpqueuewaittimeelapsed != null)
            return false;
        if (pxadpwaittimecpu != null ? !pxadpwaittimecpu.equals(that.pxadpwaittimecpu) : that.pxadpwaittimecpu != null)
            return false;
        if (pxadpwaittimeelapsed != null ? !pxadpwaittimeelapsed.equals(that.pxadpwaittimeelapsed) : that.pxadpwaittimeelapsed != null)
            return false;
        if (pxchildreqcount != null ? !pxchildreqcount.equals(that.pxchildreqcount) : that.pxchildreqcount != null)
            return false;
        if (pxchildwaitelapsed != null ? !pxchildwaitelapsed.equals(that.pxchildwaitelapsed) : that.pxchildwaitelapsed != null)
            return false;
        if (pxcnctclientresponseelapsed != null ? !pxcnctclientresponseelapsed.equals(that.pxcnctclientresponseelapsed) : that.pxcnctclientresponseelapsed != null)
            return false;
        if (pxcnctclientresponseelapsedcpu != null ? !pxcnctclientresponseelapsedcpu.equals(that.pxcnctclientresponseelapsedcpu) : that.pxcnctclientresponseelapsedcpu != null)
            return false;
        if (pxcnctinmapreqelapsed != null ? !pxcnctinmapreqelapsed.equals(that.pxcnctinmapreqelapsed) : that.pxcnctinmapreqelapsed != null)
            return false;
        if (pxcnctinmapreqcpu != null ? !pxcnctinmapreqcpu.equals(that.pxcnctinmapreqcpu) : that.pxcnctinmapreqcpu != null)
            return false;
        if (pxcnctoutmapreqcpu != null ? !pxcnctoutmapreqcpu.equals(that.pxcnctoutmapreqcpu) : that.pxcnctoutmapreqcpu != null)
            return false;
        if (pxcnctoutmapreqelapsed != null ? !pxcnctoutmapreqelapsed.equals(that.pxcnctoutmapreqelapsed) : that.pxcnctoutmapreqelapsed != null)
            return false;
        if (pxdeclpagecount != null ? !pxdeclpagecount.equals(that.pxdeclpagecount) : that.pxdeclpagecount != null)
            return false;
        if (pxdeclpageloadcount != null ? !pxdeclpageloadcount.equals(that.pxdeclpageloadcount) : that.pxdeclpageloadcount != null)
            return false;
        if (pxdeclpageloadcpu != null ? !pxdeclpageloadcpu.equals(that.pxdeclpageloadcpu) : that.pxdeclpageloadcpu != null)
            return false;
        if (pxdeclpageloadelapsed != null ? !pxdeclpageloadelapsed.equals(that.pxdeclpageloadelapsed) : that.pxdeclpageloadelapsed != null)
            return false;
        if (pxfuacachedbloadcpu != null ? !pxfuacachedbloadcpu.equals(that.pxfuacachedbloadcpu) : that.pxfuacachedbloadcpu != null)
            return false;
        if (pxfuacachedbloadelapsed != null ? !pxfuacachedbloadelapsed.equals(that.pxfuacachedbloadelapsed) : that.pxfuacachedbloadelapsed != null)
            return false;
        if (pxfuawritetodbtimecpu != null ? !pxfuawritetodbtimecpu.equals(that.pxfuawritetodbtimecpu) : that.pxfuawritetodbtimecpu != null)
            return false;
        if (pxfuawritetodbtimeelapsed != null ? !pxfuawritetodbtimeelapsed.equals(that.pxfuawritetodbtimeelapsed) : that.pxfuawritetodbtimeelapsed != null)
            return false;
        if (pxinfergeneratedjavahlcpu != null ? !pxinfergeneratedjavahlcpu.equals(that.pxinfergeneratedjavahlcpu) : that.pxinfergeneratedjavahlcpu != null)
            return false;
        if (pxjavaassemblehlcpu != null ? !pxjavaassemblehlcpu.equals(that.pxjavaassemblehlcpu) : that.pxjavaassemblehlcpu != null)
            return false;
        if (pxtrackerreporttimecpu != null ? !pxtrackerreporttimecpu.equals(that.pxtrackerreporttimecpu) : that.pxtrackerreporttimecpu != null)
            return false;
        if (pxtrackerreporttimeelapsed != null ? !pxtrackerreporttimeelapsed.equals(that.pxtrackerreporttimeelapsed) : that.pxtrackerreporttimeelapsed != null)
            return false;
        if (pxexceptioncount != null ? !pxexceptioncount.equals(that.pxexceptioncount) : that.pxexceptioncount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pxcommitdatetime != null ? pxcommitdatetime.hashCode() : 0;
        result = 31 * result + (pxsavedatetime != null ? pxsavedatetime.hashCode() : 0);
        result = 31 * result + (pxactivationdatatimecpu != null ? pxactivationdatatimecpu.hashCode() : 0);
        result = 31 * result + (pxactivationdatatimeelapsed != null ? pxactivationdatatimeelapsed.hashCode() : 0);
        result = 31 * result + (pxactivitycount != null ? pxactivitycount.hashCode() : 0);
        result = 31 * result + (pxalertcount != null ? pxalertcount.hashCode() : 0);
        result = 31 * result + (pxapplication != null ? pxapplication.hashCode() : 0);
        result = 31 * result + (pxcheckout != null ? pxcheckout.hashCode() : 0);
        result = 31 * result + (pxcommitcount != null ? pxcommitcount.hashCode() : 0);
        result = 31 * result + (pxcommitelapsed != null ? pxcommitelapsed.hashCode() : 0);
        result = 31 * result + (pxcommitrowcount != null ? pxcommitrowcount.hashCode() : 0);
        result = 31 * result + (pxconnectcount != null ? pxconnectcount.hashCode() : 0);
        result = 31 * result + (pxconnectelapsed != null ? pxconnectelapsed.hashCode() : 0);
        result = 31 * result + (pxdbinputbytes != null ? pxdbinputbytes.hashCode() : 0);
        result = 31 * result + (pxdbopexceedingthresholdcount != null ? pxdbopexceedingthresholdcount.hashCode() : 0);
        result = 31 * result + (pxdboutputbytes != null ? pxdboutputbytes.hashCode() : 0);
        result = 31 * result + (pxdeclarativerulereadcount != null ? pxdeclarativerulereadcount.hashCode() : 0);
        result = 31 * result + (pxdeclarativerulesinvokedcpu != null ? pxdeclarativerulesinvokedcpu.hashCode() : 0);
        result = 31 * result + (pxdeclarativerulesinvokedcount != null ? pxdeclarativerulesinvokedcount.hashCode() : 0);
        result = 31 * result + (pxdeclarativeruleslookupcpu != null ? pxdeclarativeruleslookupcpu.hashCode() : 0);
        result = 31 * result + (pxdeclarativeruleslookupcount != null ? pxdeclarativeruleslookupcount.hashCode() : 0);
        result = 31 * result + (pxdeclexprctxfreeusecount != null ? pxdeclexprctxfreeusecount.hashCode() : 0);
        result = 31 * result + (pxdeclexprctxsensusecount != null ? pxdeclexprctxsensusecount.hashCode() : 0);
        result = 31 * result + (pxdeclntwksbuildhlelap != null ? pxdeclntwksbuildhlelap.hashCode() : 0);
        result = 31 * result + (pxdeclntwksbuildhlcpu != null ? pxdeclntwksbuildhlcpu.hashCode() : 0);
        result = 31 * result + (pxdeclntwksbuildconstelapsed != null ? pxdeclntwksbuildconstelapsed.hashCode() : 0);
        result = 31 * result + (pxdeclntwksbuildconstcpu != null ? pxdeclntwksbuildconstcpu.hashCode() : 0);
        result = 31 * result + (pxdeclrulesinvokedelapsed != null ? pxdeclrulesinvokedelapsed.hashCode() : 0);
        result = 31 * result + (pxdeclrulesinvokedbckgrdcnt != null ? pxdeclrulesinvokedbckgrdcnt.hashCode() : 0);
        result = 31 * result + (pxdeclruleslookupelapsed != null ? pxdeclruleslookupelapsed.hashCode() : 0);
        result = 31 * result + (pxdecryptcount != null ? pxdecryptcount.hashCode() : 0);
        result = 31 * result + (pxdecryptcpu != null ? pxdecryptcpu.hashCode() : 0);
        result = 31 * result + (pxdecryptelapsed != null ? pxdecryptelapsed.hashCode() : 0);
        result = 31 * result + (pxencodedrulesets != null ? pxencodedrulesets.hashCode() : 0);
        result = 31 * result + (pxencryptcount != null ? pxencryptcount.hashCode() : 0);
        result = 31 * result + (pxencryptcpu != null ? pxencryptcpu.hashCode() : 0);
        result = 31 * result + (pxencryptelapsed != null ? pxencryptelapsed.hashCode() : 0);
        result = 31 * result + (pxflowcount != null ? pxflowcount.hashCode() : 0);
        result = 31 * result + (pxindexcount != null ? pxindexcount.hashCode() : 0);
        result = 31 * result + (pxinfergeneratedjavacount != null ? pxinfergeneratedjavacount.hashCode() : 0);
        result = 31 * result + (pxinfergeneratedjavacpu != null ? pxinfergeneratedjavacpu.hashCode() : 0);
        result = 31 * result + (pxinfergeneratedjavaelapsed != null ? pxinfergeneratedjavaelapsed.hashCode() : 0);
        result = 31 * result + (pxinfergeneratedjavahlelapsed != null ? pxinfergeneratedjavahlelapsed.hashCode() : 0);
        result = 31 * result + (pxinputbytes != null ? pxinputbytes.hashCode() : 0);
        result = 31 * result + (pxinsname != null ? pxinsname.hashCode() : 0);
        result = 31 * result + (pxinteractions != null ? pxinteractions.hashCode() : 0);
        result = 31 * result + (pxjavaassemblecpu != null ? pxjavaassemblecpu.hashCode() : 0);
        result = 31 * result + (pxjavaassemblecount != null ? pxjavaassemblecount.hashCode() : 0);
        result = 31 * result + (pxjavaassembleelapsed != null ? pxjavaassembleelapsed.hashCode() : 0);
        result = 31 * result + (pxjavaassemblehlelapsed != null ? pxjavaassemblehlelapsed.hashCode() : 0);
        result = 31 * result + (pxjavacompilecpu != null ? pxjavacompilecpu.hashCode() : 0);
        result = 31 * result + (pxjavacompilecount != null ? pxjavacompilecount.hashCode() : 0);
        result = 31 * result + (pxjavacompileelapsed != null ? pxjavacompileelapsed.hashCode() : 0);
        result = 31 * result + (pxjavageneratecpu != null ? pxjavageneratecpu.hashCode() : 0);
        result = 31 * result + (pxjavageneratecount != null ? pxjavageneratecount.hashCode() : 0);
        result = 31 * result + (pxjavagenerateelapsed != null ? pxjavagenerateelapsed.hashCode() : 0);
        result = 31 * result + (pxjavastepcpu != null ? pxjavastepcpu.hashCode() : 0);
        result = 31 * result + (pxjavastepcount != null ? pxjavastepcount.hashCode() : 0);
        result = 31 * result + (pxjavastepelapsed != null ? pxjavastepelapsed.hashCode() : 0);
        result = 31 * result + (pxjavasyntaxcpu != null ? pxjavasyntaxcpu.hashCode() : 0);
        result = 31 * result + (pxjavasyntaxcount != null ? pxjavasyntaxcount.hashCode() : 0);
        result = 31 * result + (pxjavasyntaxelapsed != null ? pxjavasyntaxelapsed.hashCode() : 0);
        result = 31 * result + (pxlegacyruleapiusedcount != null ? pxlegacyruleapiusedcount.hashCode() : 0);
        result = 31 * result + (pxlistrowwithfilteredstrmcnt != null ? pxlistrowwithfilteredstrmcnt.hashCode() : 0);
        result = 31 * result + (pxlistrowwithunfilteredstrmcnt != null ? pxlistrowwithunfilteredstrmcnt.hashCode() : 0);
        result = 31 * result + (pxlistrowwithoutstreamcount != null ? pxlistrowwithoutstreamcount.hashCode() : 0);
        result = 31 * result + (pxlistwithfilteredstreamcount != null ? pxlistwithfilteredstreamcount.hashCode() : 0);
        result = 31 * result + (pxlistwithunfilteredstrmcnt != null ? pxlistwithunfilteredstrmcnt.hashCode() : 0);
        result = 31 * result + (pxlistwithoutstreamcount != null ? pxlistwithoutstreamcount.hashCode() : 0);
        result = 31 * result + (pxlookuplistdbfetches != null ? pxlookuplistdbfetches.hashCode() : 0);
        result = 31 * result + (pxnewfuainstances != null ? pxnewfuainstances.hashCode() : 0);
        result = 31 * result + (pxobjclass != null ? pxobjclass.hashCode() : 0);
        result = 31 * result + (pxotherbrowsecpu != null ? pxotherbrowsecpu.hashCode() : 0);
        result = 31 * result + (pxotherbrowseelapsed != null ? pxotherbrowseelapsed.hashCode() : 0);
        result = 31 * result + (pxotherbrowsefiltercpu != null ? pxotherbrowsefiltercpu.hashCode() : 0);
        result = 31 * result + (pxotherbrowsefiltercnt != null ? pxotherbrowsefiltercnt.hashCode() : 0);
        result = 31 * result + (pxotherbrowsefilterelapsed != null ? pxotherbrowsefilterelapsed.hashCode() : 0);
        result = 31 * result + (pxotherbrowsereturned != null ? pxotherbrowsereturned.hashCode() : 0);
        result = 31 * result + (pxothercount != null ? pxothercount.hashCode() : 0);
        result = 31 * result + (pxotherfromcachecount != null ? pxotherfromcachecount.hashCode() : 0);
        result = 31 * result + (pxotheriocpu != null ? pxotheriocpu.hashCode() : 0);
        result = 31 * result + (pxotheriocount != null ? pxotheriocount.hashCode() : 0);
        result = 31 * result + (pxotherioelapsed != null ? pxotherioelapsed.hashCode() : 0);
        result = 31 * result + (pxoutputbytes != null ? pxoutputbytes.hashCode() : 0);
        result = 31 * result + (pxparserulecount != null ? pxparserulecount.hashCode() : 0);
        result = 31 * result + (pxparseruletime != null ? pxparseruletime.hashCode() : 0);
        result = 31 * result + (pxparseruletimecpu != null ? pxparseruletimecpu.hashCode() : 0);
        result = 31 * result + (pxpassivationcount != null ? pxpassivationcount.hashCode() : 0);
        result = 31 * result + (pxpassivationdatatimecpu != null ? pxpassivationdatatimecpu.hashCode() : 0);
        result = 31 * result + (pxpassivationdatatimeelapsed != null ? pxpassivationdatatimeelapsed.hashCode() : 0);
        result = 31 * result + (pxpassivationidletimeelapsed != null ? pxpassivationidletimeelapsed.hashCode() : 0);
        result = 31 * result + (pxpassivationsizeaverage != null ? pxpassivationsizeaverage.hashCode() : 0);
        result = 31 * result + (pxpassivationsizelast != null ? pxpassivationsizelast.hashCode() : 0);
        result = 31 * result + (pxpassivationsizepeak != null ? pxpassivationsizepeak.hashCode() : 0);
        result = 31 * result + (pxproceduralrulereadcount != null ? pxproceduralrulereadcount.hashCode() : 0);
        result = 31 * result + (pxprocesscpu != null ? pxprocesscpu.hashCode() : 0);
        result = 31 * result + (pxproclabel != null ? pxproclabel.hashCode() : 0);
        result = 31 * result + (pxpropertyreadcount != null ? pxpropertyreadcount.hashCode() : 0);
        result = 31 * result + (pxrdbiocount != null ? pxrdbiocount.hashCode() : 0);
        result = 31 * result + (pxrdbioelapsed != null ? pxrdbioelapsed.hashCode() : 0);
        result = 31 * result + (pxrdbrowwithstreamcount != null ? pxrdbrowwithstreamcount.hashCode() : 0);
        result = 31 * result + (pxrdbrowwithoutstreamcount != null ? pxrdbrowwithoutstreamcount.hashCode() : 0);
        result = 31 * result + (pxrdbwithstreamcount != null ? pxrdbwithstreamcount.hashCode() : 0);
        result = 31 * result + (pxrdbwithoutstreamcount != null ? pxrdbwithoutstreamcount.hashCode() : 0);
        result = 31 * result + (pxreferencepropertyusecpu != null ? pxreferencepropertyusecpu.hashCode() : 0);
        result = 31 * result + (pxreferencepropertyusecount != null ? pxreferencepropertyusecount.hashCode() : 0);
        result = 31 * result + (pxreferencepropertyuseelapsed != null ? pxreferencepropertyuseelapsed.hashCode() : 0);
        result = 31 * result + (pxrequestorid != null ? pxrequestorid.hashCode() : 0);
        result = 31 * result + (pxrequestorstart != null ? pxrequestorstart.hashCode() : 0);
        result = 31 * result + (pxrequestortype != null ? pxrequestortype.hashCode() : 0);
        result = 31 * result + (pxrulebrowsecpu != null ? pxrulebrowsecpu.hashCode() : 0);
        result = 31 * result + (pxrulebrowseelapsed != null ? pxrulebrowseelapsed.hashCode() : 0);
        result = 31 * result + (pxrulebrowsefiltercpu != null ? pxrulebrowsefiltercpu.hashCode() : 0);
        result = 31 * result + (pxrulebrowsefiltercnt != null ? pxrulebrowsefiltercnt.hashCode() : 0);
        result = 31 * result + (pxrulebrowsefilterelapsed != null ? pxrulebrowsefilterelapsed.hashCode() : 0);
        result = 31 * result + (pxrulebrowsereturned != null ? pxrulebrowsereturned.hashCode() : 0);
        result = 31 * result + (pxrulecpu != null ? pxrulecpu.hashCode() : 0);
        result = 31 * result + (pxrulecount != null ? pxrulecount.hashCode() : 0);
        result = 31 * result + (pxrulefromcachecount != null ? pxrulefromcachecount.hashCode() : 0);
        result = 31 * result + (pxruleioelapsed != null ? pxruleioelapsed.hashCode() : 0);
        result = 31 * result + (pxrulesexecuted != null ? pxrulesexecuted.hashCode() : 0);
        result = 31 * result + (pxrulesused != null ? pxrulesused.hashCode() : 0);
        result = 31 * result + (pxrunmodelcount != null ? pxrunmodelcount.hashCode() : 0);
        result = 31 * result + (pxrunotherrulecount != null ? pxrunotherrulecount.hashCode() : 0);
        result = 31 * result + (pxrunstreamcount != null ? pxrunstreamcount.hashCode() : 0);
        result = 31 * result + (pxrunwhencount != null ? pxrunwhencount.hashCode() : 0);
        result = 31 * result + (pxsavedcbafterintcount != null ? pxsavedcbafterintcount.hashCode() : 0);
        result = 31 * result + (pxsavedcbafterintcpu != null ? pxsavedcbafterintcpu.hashCode() : 0);
        result = 31 * result + (pxsavedcbafterintelapsed != null ? pxsavedcbafterintelapsed.hashCode() : 0);
        result = 31 * result + (pxsavedcxtafterintcpu != null ? pxsavedcxtafterintcpu.hashCode() : 0);
        result = 31 * result + (pxsavedcxtafterintcount != null ? pxsavedcxtafterintcount.hashCode() : 0);
        result = 31 * result + (pxsavedcxtafterintelapsed != null ? pxsavedcxtafterintelapsed.hashCode() : 0);
        result = 31 * result + (pxserviceactivitycpu != null ? pxserviceactivitycpu.hashCode() : 0);
        result = 31 * result + (pxserviceactivitytime != null ? pxserviceactivitytime.hashCode() : 0);
        result = 31 * result + (pxservicecount != null ? pxservicecount.hashCode() : 0);
        result = 31 * result + (pxservicedatavolume != null ? pxservicedatavolume.hashCode() : 0);
        result = 31 * result + (pxserviceinmapreqcpu != null ? pxserviceinmapreqcpu.hashCode() : 0);
        result = 31 * result + (pxserviceinmapreqtime != null ? pxserviceinmapreqtime.hashCode() : 0);
        result = 31 * result + (pxservicenumfilerecords != null ? pxservicenumfilerecords.hashCode() : 0);
        result = 31 * result + (pxserviceoutmapreqcpu != null ? pxserviceoutmapreqcpu.hashCode() : 0);
        result = 31 * result + (pxserviceoutmapreqtime != null ? pxserviceoutmapreqtime.hashCode() : 0);
        result = 31 * result + (pxsnapshottime != null ? pxsnapshottime.hashCode() : 0);
        result = 31 * result + (pxsnapshottype != null ? pxsnapshottype.hashCode() : 0);
        result = 31 * result + (pxstreamtimecpu != null ? pxstreamtimecpu.hashCode() : 0);
        result = 31 * result + (pxstreamtimeelapsed != null ? pxstreamtimeelapsed.hashCode() : 0);
        result = 31 * result + (pxsystemname != null ? pxsystemname.hashCode() : 0);
        result = 31 * result + (pxsystemnode != null ? pxsystemnode.hashCode() : 0);
        result = 31 * result + (pxsystemnodeid != null ? pxsystemnodeid.hashCode() : 0);
        result = 31 * result + (pxsystemstart != null ? pxsystemstart.hashCode() : 0);
        result = 31 * result + (pxtotalreqcpu != null ? pxtotalreqcpu.hashCode() : 0);
        result = 31 * result + (pxtotalreqtime != null ? pxtotalreqtime.hashCode() : 0);
        result = 31 * result + (pxtrackedpropertychangescount != null ? pxtrackedpropertychangescount.hashCode() : 0);
        result = 31 * result + (pxtransientjavaassemblecpu != null ? pxtransientjavaassemblecpu.hashCode() : 0);
        result = 31 * result + (pxtransientjavaassemblecount != null ? pxtransientjavaassemblecount.hashCode() : 0);
        result = 31 * result + (pxtransientjavaassembleelapsed != null ? pxtransientjavaassembleelapsed.hashCode() : 0);
        result = 31 * result + (pxtransientjavacompilecpu != null ? pxtransientjavacompilecpu.hashCode() : 0);
        result = 31 * result + (pxtransientjavacompilecount != null ? pxtransientjavacompilecount.hashCode() : 0);
        result = 31 * result + (pxtransientjavacompileelapsed != null ? pxtransientjavacompileelapsed.hashCode() : 0);
        result = 31 * result + (pxuseragent != null ? pxuseragent.hashCode() : 0);
        result = 31 * result + (pyuseridentifier != null ? pyuseridentifier.hashCode() : 0);
        result = 31 * result + (pzinskey != null ? pzinskey.hashCode() : 0);
        result = 31 * result + (pxclientloadelapsed != null ? pxclientloadelapsed.hashCode() : 0);
        result = 31 * result + (pxclientloadcount != null ? pxclientloadcount.hashCode() : 0);
        result = 31 * result + (pxadpcntxtsetuptimecpu != null ? pxadpcntxtsetuptimecpu.hashCode() : 0);
        result = 31 * result + (pxadpcntxtsetuptimeelapsed != null ? pxadpcntxtsetuptimeelapsed.hashCode() : 0);
        result = 31 * result + (pxadploadacttimecpu != null ? pxadploadacttimecpu.hashCode() : 0);
        result = 31 * result + (pxadploadacttimeelapsed != null ? pxadploadacttimeelapsed.hashCode() : 0);
        result = 31 * result + (pxadploadsusedcount != null ? pxadploadsusedcount.hashCode() : 0);
        result = 31 * result + (pxadppagecopytimecpu != null ? pxadppagecopytimecpu.hashCode() : 0);
        result = 31 * result + (pxadppagecopytimeelapsed != null ? pxadppagecopytimeelapsed.hashCode() : 0);
        result = 31 * result + (pxadpqueuewaittimecpu != null ? pxadpqueuewaittimecpu.hashCode() : 0);
        result = 31 * result + (pxadpqueuewaittimeelapsed != null ? pxadpqueuewaittimeelapsed.hashCode() : 0);
        result = 31 * result + (pxadpwaittimecpu != null ? pxadpwaittimecpu.hashCode() : 0);
        result = 31 * result + (pxadpwaittimeelapsed != null ? pxadpwaittimeelapsed.hashCode() : 0);
        result = 31 * result + (pxchildreqcount != null ? pxchildreqcount.hashCode() : 0);
        result = 31 * result + (pxchildwaitelapsed != null ? pxchildwaitelapsed.hashCode() : 0);
        result = 31 * result + (pxcnctclientresponseelapsed != null ? pxcnctclientresponseelapsed.hashCode() : 0);
        result = 31 * result + (pxcnctclientresponseelapsedcpu != null ? pxcnctclientresponseelapsedcpu.hashCode() : 0);
        result = 31 * result + (pxcnctinmapreqelapsed != null ? pxcnctinmapreqelapsed.hashCode() : 0);
        result = 31 * result + (pxcnctinmapreqcpu != null ? pxcnctinmapreqcpu.hashCode() : 0);
        result = 31 * result + (pxcnctoutmapreqcpu != null ? pxcnctoutmapreqcpu.hashCode() : 0);
        result = 31 * result + (pxcnctoutmapreqelapsed != null ? pxcnctoutmapreqelapsed.hashCode() : 0);
        result = 31 * result + (pxdeclpagecount != null ? pxdeclpagecount.hashCode() : 0);
        result = 31 * result + (pxdeclpageloadcount != null ? pxdeclpageloadcount.hashCode() : 0);
        result = 31 * result + (pxdeclpageloadcpu != null ? pxdeclpageloadcpu.hashCode() : 0);
        result = 31 * result + (pxdeclpageloadelapsed != null ? pxdeclpageloadelapsed.hashCode() : 0);
        result = 31 * result + (pxfuacachedbloadcpu != null ? pxfuacachedbloadcpu.hashCode() : 0);
        result = 31 * result + (pxfuacachedbloadelapsed != null ? pxfuacachedbloadelapsed.hashCode() : 0);
        result = 31 * result + (pxfuawritetodbtimecpu != null ? pxfuawritetodbtimecpu.hashCode() : 0);
        result = 31 * result + (pxfuawritetodbtimeelapsed != null ? pxfuawritetodbtimeelapsed.hashCode() : 0);
        result = 31 * result + (pxinfergeneratedjavahlcpu != null ? pxinfergeneratedjavahlcpu.hashCode() : 0);
        result = 31 * result + (pxjavaassemblehlcpu != null ? pxjavaassemblehlcpu.hashCode() : 0);
        result = 31 * result + (pxtrackerreporttimecpu != null ? pxtrackerreporttimecpu.hashCode() : 0);
        result = 31 * result + (pxtrackerreporttimeelapsed != null ? pxtrackerreporttimeelapsed.hashCode() : 0);
        result = 31 * result + (pxexceptioncount != null ? pxexceptioncount.hashCode() : 0);
        return result;
    }
}
