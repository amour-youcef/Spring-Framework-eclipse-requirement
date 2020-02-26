<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://codex.wordpress.org/Editing_wp-config.php
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'momcards' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', '' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'g*C<2u| AYT:68.{+31d6)m$Fi$9![P<&L*,MZe#p|.aCK-gx#M,JeDOB*6%{87V' );
define( 'SECURE_AUTH_KEY',  'S<`7Mxw?N[ EGO]|;}zl *:a,(^9sP8c)jqJC*->T@jub;WeJDyO8/~XW(au8?sd' );
define( 'LOGGED_IN_KEY',    'bR=wuxgpb|]2mRq0*;(!<c~,zr[Lc{.6^N WH7QX6aJLM3sz64H]3y#a$?NiA4N_' );
define( 'NONCE_KEY',        '>n#4-d,1i~Q]*}I6HakT.y!g0n7-TfefNOL$M5INLA3xmTP{ZiaIC3{AAg07`#n!' );
define( 'AUTH_SALT',        ')zWgD^J!!c~v*^+Txk%&S0M9aW~nFYc_b(tp[tI|7w[Ks}Y]ZH3o~jC,pK35UtL|' );
define( 'SECURE_AUTH_SALT', '0wr68`XfL/NB#&+qE4Sx,+_hOS,< `J/9gZuRKYWC2@CsXBPB;S=},xsgIz>9[0L' );
define( 'LOGGED_IN_SALT',   '@0KFkxu[!,>cIB{9@=0i:KdRudc!5{WZ7Y3>~VDbp%aP!k:m#Q;Ay7%WUeCH/d8G' );
define( 'NONCE_SALT',       'GL?pXmD0;?qLFP: 7)/52z<df*I*cH&8V3`NOzV_1<p!jI?i]~$#HN@i#9$4aB>y' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the Codex.
 *
 * @link https://codex.wordpress.org/Debugging_in_WordPress
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', dirname( __FILE__ ) . '/' );
}

/** Sets up WordPress vars and included files. */
require_once( ABSPATH . 'wp-settings.php' );
