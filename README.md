<div align="center">
<h1>Best-Adrules</h1>
  <p>
    Best-Adrules，关圣云®自行整理优秀的规则，合并去重优秀上游订阅。官网https://down.newlover.cn 官方微信群及QQ群见官网公布。关圣云®DNS，一个人人可加入的公益去广告dns团队，捐赠，或者提供服务器均可加入“关圣云®爱发电”团队。 由于目前网络上发布的规则众多，逐个添加难免有重复的，而且及其不方便，因此创建此仓库，来整合关圣云在用的规则，方便关圣云更新dns规则，也可以方便其他自建dns的小伙伴一键导入。 
</p>
</div>


<h2 id="a">📔 说明</h2>

Best-Adrules项目旨在按需求整合 `AdGuard` 规则。定时从上游订阅获取规则，去除`重复`和`不受支持`的规则并进行分类。如果存在误杀请手动放行。  
支持`AdGuard`、`AdGuard Home`,每`12小时`自动更新一次  
大家如果有发现优秀上游，可以在官网加群反馈，或者提issue

#### 上游规则

<details>
<summary>点击查看</summary>
<ul>
    <li><a href="https://adrules.top/dns.txt">adrules</a></li>
    <li><a href="https://anti-ad.net/easylist.txt">anti-AD (仅合并去重，争议与我无关)</a></li>
    <li><a href="https://raw.githubusercontent.com/8680/GOODBYEADS/master/rules.txt">GOODBYEADS-黑名单</a></li> 
    <li><a href="https://raw.githubusercontent.com/8680/GOODBYEADS/master/allow.txt">GOODBYEADS-白名单</a></li> 
    <li><a href="https://raw.hellogithub.com/hosts">github520-github加速访问</a></li>
    <li><a href="https://raw.githubusercontent.com/TG-Twilight/AWAvenue-Ads-Rule/main/AWAvenue-Ads-Rule.txt">秋风广告规则</a></li>
  
</ul>
</details>

#### 本地规则

- [mylist](#)
> 主要是对上游规则的修正补充，根据关圣云用户日常使用体验，解除一些失误拦截

<h2 id="b">🎯 订阅</h2>

| 名称           | 说明                                                | Github订阅（需要梯子）                                                                        | jsDelivr加速订阅（大于20MB不可用）                                                                        |ghproxy加速订阅 （推荐）                                                                       |
|--------------|---------------------------------------------------|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| `all.txt`    | 去重的规则合集，包含以下所有规则，适用于 `AdGuard` 客户端                | [✈️点此查看](https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/all.txt)      | [🚀点此查看](https://cdn.jsdelivr.net/gh/guandasheng/best-adrules@main/rule/all.txt)    |[🚀点此查看](https://mirror.ghproxy.com/https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/all.txt)   |
| `adgh.txt`   | 针对 `AdGuardHome` 的规则，包含 `domain.txt` `regex.txt`和`mylist.txt` | [✈️点此查看](https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/adgh.txt)   | [🚀点此查看](https://cdn.jsdelivr.net/gh/guandasheng/best-adrules@main/rule/adgh.txt)   |[🚀点此查看](https://mirror.ghproxy.com/https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/adgh.txt)    |
| `domain.txt` | 域名规则，`AdGuard`和`AdGuardHome`都支持                                       | [✈️点此查看](https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/domain.txt) | [🚀点此查看](https://cdn.jsdelivr.net/gh/guandasheng/best-adrules@main/rule/domain.txt) |[🚀点此查看](https://mirror.ghproxy.com/https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/domain.txt)    |
| `hosts.txt`  | `hosts` 规则，~~包含一些访问加速~~                           | [✈️点此查看](https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/hosts.txt)  | [🚀点此查看](https://cdn.jsdelivr.net/gh/guandasheng/best-adrules@main/rule/hosts.txt)  |[🚀点此查看](https://mirror.ghproxy.com/https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/hosts.txt)    |
| `modify.txt` | 修饰规则，`AdGuard`支持                                      | [✈️点此查看](https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/modify.txt) | [🚀点此查看](https://cdn.jsdelivr.net/gh/guandasheng/best-adrules@main/rule/modify.txt) |[🚀点此查看](https://mirror.ghproxy.com/https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/modify.txt)    |
| `regex.txt` | 正则规则，`AdGuardHome`支持                                       | [✈️点此查看](https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/regex.txt) | [🚀点此查看](https://cdn.jsdelivr.net/gh/guandasheng/best-adrules@main/rule/regex.txt) |[🚀点此查看](https://mirror.ghproxy.com/https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/regex.txt)    |
| `mylist.txt` | 自用补充规则，人工更新                                       | [✈️点此查看](https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/mylist.txt) | [🚀点此查看](https://cdn.jsdelivr.net/gh/guandasheng/best-adrules@main/rule/mylist.txt) |[🚀点此查看](https://mirror.ghproxy.com/https://raw.githubusercontent.com/guandasheng/best-adrules/main/rule/mylist.txt)    |

<br/>
<h2 id="c">🛠️ 配置</h2>

Best-Adrules特别感谢@hululu1068开源项目，本项目基于其基础修改而来。

