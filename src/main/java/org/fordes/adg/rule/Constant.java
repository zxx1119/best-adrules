package org.fordes.adg.rule;

import java.io.File;

public class Constant {

    public static final String ROOT_PATH = System.getProperty("user.dir");

    public static final String UPDATE = "# Update time: {}\r\n";

    public static final String REPO = "# Repo URL: AdGuard、AdGuardHome广告过滤规则合并/去重\r\n\r\n###################################   合并/去重自以下规则   ####################################\r\n# - 'https://adrules.top/dns.txt'  #adrules\r\n# - 'https://anti-ad.net/easylist.txt' #anti-AD仅合并去重，争议与我无关\r\n# - 'https://raw.githubusercontent.com/8680/GOODBYEADS/master/rules.txt' #GOODBYEADS-黑名单\r\n# - 'https://raw.githubusercontent.com/8680/GOODBYEADS/master/allow.txt' #GOODBYEADS-白名单\r\n# - 'https://raw.hellogithub.com/hosts' #github520-github加速访问\r\n# - 'https://raw.githubusercontent.com/TG-Twilight/AWAvenue-Ads-Rule/main/AWAvenue-Ads-Rule.txt' #秋风广告规则\r\n# 本地规则\r\n# - 'mylist.txt'\r\n###############################################################################################\r\n\r\n# 每12小时同步一次、如有误杀、请手动解除\r\n\r\n";

    public static final String LOCAL_RULE_SUFFIX = ROOT_PATH + File.separator + "rule";

    /**
     * 基本的有效性检测正则，!开头，[]包裹，非特殊标记的#号开头均视为无效规则
     */
    public static final String EFFICIENT_REGEX = "^!|^#[^#,^@,^%,^\\$]|^\\[.*\\]$";

    /**
     * 去除首尾基础修饰符号 的正则，方便对规则进行分类
     * 包含：@@、||、@@||、/ 开头，$important、/ 结尾
     */
    public static final String BASIC_MODIFY_REGEX = "^@@\\|\\||^\\|\\||^@@|\\$important$|\\s#[^#]*$";

}
