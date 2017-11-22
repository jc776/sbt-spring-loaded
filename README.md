# sbt-spring-loaded

[spring-loaded](https://github.com/spring-projects/spring-loaded) loads modified classes 'live' - you can make changes to running code without losing state or restarting the JVM.

This plugin lets you use spring-loaded in SBT without manually downloading JARs or setting up `javaagent`. It uses  [spray/sbt-revolver](https://github.com/spray/sbt-revolver), and uses the same commands:

- `reStart` runs the application 'in the background'. Running it twice kills/restarts it. `reStop` stops it.
- Compiling classes (e.g. `~compile`) will then load them live.

This is for SBT 1.0+. For SBT 0.13, use [kbrowder/sbt-spring-loaded](https://github.com/kbrowder/sbt-spring-loaded).

## Installing

Manual local install for now.

```bash
git clone https://github.com/jc776/sbt-spring-loaded
sbt
> publishLocal
```

```scala
// project/plugins.sbt
addSbtPlugin("com.jc776" % "sbt-spring-loaded" % "0.0.1-SNAPSHOT")
```

## License

Here's my interpretation, I'm not a lawyer:

- [kbrowder/sbt-spring-loaded](https://github.com/kbrowder/sbt-spring-loaded) is GPLv3, and this plugin uses bits of that, so this one is GPL
- Changes made: It's on SBT 1.0. I'm using revolver instead of the custom Process stuff.
- This GPL shouldn't affect the license of anything that uses it as a dev tool
- Derivative plugins modified from this, or compound plugins using it should be GPL