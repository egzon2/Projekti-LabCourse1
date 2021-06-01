USE [master]
GO

/****** Object:  Database [GymManagementSystem]    Script Date: 07/05/2020 02:34:29 ******/
CREATE DATABASE [GymManagementSystem]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'GymManagementSystem', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\GymManagementSystem.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'GymManagementSystem_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\GymManagementSystem_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO

ALTER DATABASE [GymManagementSystem] SET COMPATIBILITY_LEVEL = 140
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [GymManagementSystem].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [GymManagementSystem] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [GymManagementSystem] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [GymManagementSystem] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [GymManagementSystem] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [GymManagementSystem] SET ARITHABORT OFF 
GO

ALTER DATABASE [GymManagementSystem] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [GymManagementSystem] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [GymManagementSystem] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [GymManagementSystem] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [GymManagementSystem] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [GymManagementSystem] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [GymManagementSystem] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [GymManagementSystem] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [GymManagementSystem] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [GymManagementSystem] SET  DISABLE_BROKER 
GO

ALTER DATABASE [GymManagementSystem] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [GymManagementSystem] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [GymManagementSystem] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [GymManagementSystem] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [GymManagementSystem] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [GymManagementSystem] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [GymManagementSystem] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [GymManagementSystem] SET RECOVERY SIMPLE 
GO

ALTER DATABASE [GymManagementSystem] SET  MULTI_USER 
GO

ALTER DATABASE [GymManagementSystem] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [GymManagementSystem] SET DB_CHAINING OFF 
GO

ALTER DATABASE [GymManagementSystem] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [GymManagementSystem] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [GymManagementSystem] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [GymManagementSystem] SET QUERY_STORE = OFF
GO

ALTER DATABASE [GymManagementSystem] SET  READ_WRITE 
GO

USE [GymManagementSystem]
GO
/****** Object:  Table [dbo].[Fitnesi]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Fitnesi](
	[FID] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](50) NULL,
	[NrTelefonit] [int] NULL,
	[Qyteti] [varchar](50) NULL,
	[Adresa] [varchar](50) NULL,
	[NrBiznesit] [int] NULL,
 CONSTRAINT [PK_Fitnesi] PRIMARY KEY CLUSTERED 
(
	[FID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Klienti]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Klienti](
	[KID] [int] IDENTITY(1,1) NOT NULL,
	[TID] [int] NULL,
	[FID] [int] NULL,
	[Emri] [varchar](50) NULL,
	[Mbiemri] [varchar](50) NULL,
	[Gjinia] [char](1) NULL,
	[NrPersonal] [int] NULL,
	[Mosha] [int] NULL,
	[Qyteti] [varchar](50) NULL,
	[Adresa] [nchar](10) NULL,
 CONSTRAINT [PK_Klienti] PRIMARY KEY CLUSTERED 
(
	[KID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Menagjeri]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Menagjeri](
	[MID] [int] IDENTITY(1,1) NOT NULL,
	[SID] [int] NULL,
	[Emri] [varchar](50) NULL,
	[Mbiemri] [varchar](50) NULL,
	[Mosha] [int] NULL,
	[NrPersonal] [int] NULL,
	[NrTelefonit] [int] NULL,
	[Gjinia] [char](1) NULL,
	[Qyteti] [varchar](50) NULL,
	[Adresa] [varchar](50) NULL,
 CONSTRAINT [PK_Menagjeri] PRIMARY KEY CLUSTERED 
(
	[MID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Pagesa]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Pagesa](
	[PAID] [int] IDENTITY(1,1) NOT NULL,
	[KID] [int] NULL,
	[PagesaDitore] [varchar](20) NULL,
	[PagesaJavore] [varchar](20) NULL,
	[PagesMujore] [varchar](20) NULL,
	[OfertaTreMujore] [varchar](20) NULL,
	[OfertaGjashtMujore] [varchar](20) NULL,
	[OfertaVjetore] [varchar](20) NULL,
 CONSTRAINT [PK_Pagesa] PRIMARY KEY CLUSTERED 
(
	[PAID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Paisjet]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Paisjet](
	[PSID] [int] IDENTITY(1,1) NOT NULL,
	[FID] [int] NULL,
	[NrSerik] [int] NULL,
	[Pershkrimi] [varchar](50) NULL,
 CONSTRAINT [PK_Paisjet] PRIMARY KEY CLUSTERED 
(
	[PSID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Puntori]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Puntori](
	[PID] [int] IDENTITY(1,1) NOT NULL,
	[SID] [int] NULL,
	[Emri] [varchar](50) NULL,
	[Mbiemri] [varchar](50) NULL,
	[Mosha] [int] NULL,
	[Gjinia] [char](1) NULL,
	[NrTelefonit] [int] NULL,
	[Qyteti] [varchar](50) NULL,
	[Adresa] [varchar](50) NULL,
 CONSTRAINT [PK_Puntori] PRIMARY KEY CLUSTERED 
(
	[PID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Stafi]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Stafi](
	[SID] [int] IDENTITY(1,1) NOT NULL,
	[FID] [int] NULL,
	[Emri] [varchar](50) NULL,
	[Mbiemri] [varchar](50) NULL,
	[Mosha] [int] NULL,
	[NrPersonal] [int] NULL,
	[Pershkrimi] [varchar](50) NULL,
 CONSTRAINT [PK_Stafi] PRIMARY KEY CLUSTERED 
(
	[SID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Trajneri]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Trajneri](
	[TID] [int] IDENTITY(1,1) NOT NULL,
	[SID] [int] NULL,
	[Emri] [varchar](50) NULL,
	[Mbiemri] [varchar](50) NULL,
	[Gjinia] [char](1) NULL,
	[Mosha] [int] NULL,
	[NrTelefonit] [int] NULL,
	[Qyteti] [varchar](50) NULL,
	[Adresa] [varchar](50) NULL,
 CONSTRAINT [PK_Trajneri] PRIMARY KEY CLUSTERED 
(
	[TID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Zhveshtore]    Script Date: 5/4/2020 19:32:59 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Zhveshtore](
	[ZHID] [int] IDENTITY(1,1) NOT NULL,
	[FID] [int] NULL,
	[Numri] [int] NULL,
	[Gjinia] [char](1) NULL,
 CONSTRAINT [PK_Zhveshtore] PRIMARY KEY CLUSTERED 
(
	[ZHID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

INSERT [dbo].[Fitnesi] ([Emri], [NrTelefonit], [Qyteti], [Adresa], [NrBiznesit]) VALUES (N'BeFit', 44700500, N'Gjilan', N'Mulla Idrizi', 258963)
INSERT [dbo].[Fitnesi] ([Emri], [NrTelefonit], [Qyteti], [Adresa], [NrBiznesit]) VALUES (N'BeFit', 44700501, N'Prishtine', N'Dardania', 258369)
INSERT [dbo].[Fitnesi] ([Emri], [NrTelefonit], [Qyteti], [Adresa], [NrBiznesit]) VALUES (N'BeFit', 44700502, N'Peje', N'Dukagjini', 258693)
SET IDENTITY_INSERT [dbo].[Fitnesi] OFF

INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (1, N'Egzon', N'Thaqi', 21, 141547126, N'Menagjer')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (1, N'Egzon', N'Zymberi', 21, 141547126, N'Trajner')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (3, N'Flakron', N'Zymberi', 21, 141547126, N'Menagjer')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (3, N'And', N'Shkodra', 25, 141547126, N'Trajner')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (1, N'Shkelqesa', N'Ademi', 23, 141547126, N'Trajnere')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (3, N'Nita', N'Aliu', 25, 141547126, N'Trajnere')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (2, N'Qendrim', N'Rexhepi', 29, 141547126, N'Menagjer')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (2, N'Valdrin', N'Mehuka', 25, 141547126, N'Trajner')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (2, N'Arnisa', N'Sylejmani', 24, 141547126, N'Trajnere')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (1, N'Milot', N'Hasani', 22, 141547126, N'Puntor')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (1, N'Aurita', N'Basha', 23, 141547126, N'Puntore')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (2, N'Valdrin', N'Muji', 24, 141547126, N'Puntor')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (2, N'Aulona', N'Syla', 26, 141547126, N'Puntore')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (3, N'Mimoza', N'Blakaj', 23, 141547126, N'Puntore')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (3, N'Erion', N'Musliu', 25, 141547126, N'Puntor')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (1, N'Tringa', N'Salihu', 21, 141547126, N'Menagjere')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (2, N'Elda', N'Krasniqi', 23, 141547126, N'Menagjere')
INSERT [dbo].[Stafi] ([FID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [Pershkrimi]) VALUES (3, N'Lorita', N'Leka', 25, 141547126, N'Menagjere')
SET IDENTITY_INSERT [dbo].[Stafi] OFF

INSERT [dbo].[Menagjeri] ([SID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [NrTelefonit], [Gjinia], [Qyteti], [Adresa]) VALUES (1, N'Egzon', N'Thaqi', 21, 141547126, 44256354, 'M', N'Gjilan', N'Arberia')
INSERT [dbo].[Menagjeri] ([SID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [NrTelefonit], [Gjinia], [Qyteti], [Adresa]) VALUES (2, N'Qendrim', N'Rexhepi', 29, 141235486, 44356985, 'M', N'Prishtine', N'Rruga B')
INSERT [dbo].[Menagjeri] ([SID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [NrTelefonit], [Gjinia], [Qyteti], [Adresa]) VALUES (3, N'Flakron', N'Zymberi', 21, 141516848, 44347526, 'M', N'Peje', N'Dukagjini')
INSERT [dbo].[Menagjeri] ([SID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [NrTelefonit], [Gjinia], [Qyteti], [Adresa]) VALUES (1, N'Tringa', N'Salihu', 21, 141213142, 44325623, 'F', N'Gjilan', N'Kamnik')
INSERT [dbo].[Menagjeri] ([SID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [NrTelefonit], [Gjinia], [Qyteti], [Adresa]) VALUES (2, N'Elda', N'Krasniqi', 23, 142536586, 44247851, 'F', N'Prishtine', N'Kalabria')
INSERT [dbo].[Menagjeri] ([SID], [Emri], [Mbiemri], [Mosha], [NrPersonal], [NrTelefonit], [Gjinia], [Qyteti], [Adresa]) VALUES (3, N'Lorita', N'Leka', 25, 145878564, 44523359, 'F', N'Peje', N'Dukagjini')
SET IDENTITY_INSERT [dbo].[Menagjeri] OFF

INSERT [dbo].[Trajneri] ([SID], [Emri], [Mbiemri], [Gjinia], [Mosha], [NrTelefonit], [Qyteti], [Adresa]) VALUES (1, N'Egzon', N'Zymberi', 'M', 21, 44736957, N'Gjilan', N'Bojanin')
INSERT [dbo].[Trajneri] ([SID], [Emri], [Mbiemri], [Gjinia], [Mosha], [NrTelefonit], [Qyteti], [Adresa]) VALUES (1, N'Shkelqesa', N'Ademi', 'F', 23, 44253473, N'Gjilan', N'Gavran')
INSERT [dbo].[Trajneri] ([SID], [Emri], [Mbiemri], [Gjinia], [Mosha], [NrTelefonit], [Qyteti], [Adresa]) VALUES (2, N'Valdrin', N'Mehuka', 'M', 25, 44253646, N'Prishtine', N'Rruga B')
INSERT [dbo].[Trajneri] ([SID], [Emri], [Mbiemri], [Gjinia], [Mosha], [NrTelefonit], [Qyteti], [Adresa]) VALUES (2, N'Arnisa', N'Sylejmani', 'F', 24, 49356256, N'Prishtine', N'Dardania')
INSERT [dbo].[Trajneri] ([SID], [Emri], [Mbiemri], [Gjinia], [Mosha], [NrTelefonit], [Qyteti], [Adresa]) VALUES (3, N'Nita', N'Aliu', 'F', 25, 49658951, N'Peje', N'Dukagjini')
INSERT [dbo].[Trajneri] ([SID], [Emri], [Mbiemri], [Gjinia], [Mosha], [NrTelefonit], [Qyteti], [Adresa]) VALUES (3, N'Kushtrim', N'Rexhepi', 'M', 30, 49421122, N'Peje', N'Dukagjini')
SET IDENTITY_INSERT [dbo].[Trajneri] OFF

INSERT [dbo].[Puntori] ([SID], [Emri], [Mbiemri], [Mosha], [Gjinia], [NrTelefonit], [Qyteti], [Adresa]) VALUES (1, N'Milot', N'Hasani', 22, 'M', 44125452, N'Gjilan', N'Mulla Idrizi')
INSERT [dbo].[Puntori] ([SID], [Emri], [Mbiemri], [Mosha], [Gjinia], [NrTelefonit], [Qyteti], [Adresa]) VALUES (1, N'Aurita', N'Basha', 23, 'F', 44251425, N'Gjilan', N'Bojanin')
INSERT [dbo].[Puntori] ([SID], [Emri], [Mbiemri], [Mosha], [Gjinia], [NrTelefonit], [Qyteti], [Adresa]) VALUES (2, N'Valdrin', N'Muji', 24, 'M', 44365253, N'Prishtine', N'Dardania')
INSERT [dbo].[Puntori] ([SID], [Emri], [Mbiemri], [Mosha], [Gjinia], [NrTelefonit], [Qyteti], [Adresa]) VALUES (2, N'Aulona', N'Syla', 26, 'F', 49457896, N'Prishtine', N'RRuga B')
INSERT [dbo].[Puntori] ([SID], [Emri], [Mbiemri], [Mosha], [Gjinia], [NrTelefonit], [Qyteti], [Adresa]) VALUES (3, N'Mimoza', N'Blakaj', 23, 'F', 49758465, N'Peje', N'Dukagjini')
INSERT [dbo].[Puntori] ([SID], [Emri], [Mbiemri], [Mosha], [Gjinia], [NrTelefonit], [Qyteti], [Adresa]) VALUES (3, N'Erion', N'Musliu', 25, 'M', 43564528, N'Peje', N'Dukagjini')
SET IDENTITY_INSERT [dbo].[Puntori] OFF

INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (1, 1, N'Endrit', N'Maliqi','M', 142535685, 20, N'Gjilan', N'Malishev')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (1, 1, N'Leonita', N'Halimi','F', 142536521, 20, N'Gjilan', N'Bojanin')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (2, 1, N'Lindita', N'Hamiti','F', 142532101, 21, N'Gjilan', N'Artan')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (2, 1, N'Ardit', N'Ramadani','M', 1425102110, 24, N'Gjilan', N'Skifterat')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (3, 2, N'Menderim', N'Fazliu','M', 1425210141, 21, N'Prishtine', N'Dardani')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (3, 2, N'Valentina', N'Bunjaku','F', 142172314, 31, N'Prishtine', N'Ulpian')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (4, 2, N'Enver', N'Zymberi','M', 142213253, 52, N'Prishtine', N'Pejton')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (4, 2, N'Qendresa', N'Krasniqi','F', 12543513, 32, N'Prishtine', N'Dardani')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (5, 3, N'Laura', N'Morina','F', 123124521, 25, N'Peje', N'Dukagjini')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (5, 3, N'Dardan', N'Nebihi','M', 121322012, 24, N'Peje', N'Dukagjini')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (6, 3, N'Gent', N'Rashiti','M', 121415123, 21, N'Peje', N'Dukagjini')
INSERT [dbo].[Klienti] ([TID], [FID], [Emri], [Mbiemri], [Gjinia], [NrPersonal], [Mosha], [Qyteti], [Adresa]) VALUES (6, 3, N'Miranda', N'Rahimi','F', 123132220, 24, N'Peje', N'Dukagjini')
SET IDENTITY_INSERT [dbo].[Klienti] OFF

INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (1, 5, NULL, NULL,NULL, NULL, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (2, NULL, 15, NULL,NULL, NULL, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (3, NULL, NULL, 30,NULL, NULL, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (4, NULL, NULL, NULL,60, NULL, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (5, NULL, NULL, NULL,NULL, 80, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (6, NULL, NULL, NULL,NULL, NULL, 120)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (7, 5, NULL, NULL,NULL, NULL, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (8, NULL, 15E, NULL,NULL, NULL, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (9, NULL, NULL, NULL,NULL, NULL, 120)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (10, NULL, NULL, NULL,NULL, NULL, 120)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (11, NULL, NULL, NULL,NULL, 80, NULL)
INSERT [dbo].[Pagesa] ([KID], [PagesaDitore], [PagesaJavore], [PagesMujore], [OfertaTreMujore], [OfertaGjashtMujore], [OfertaVjetore]) VALUES (12, NULL, NULL, NULL,60, NULL, NULL)
SET IDENTITY_INSERT [dbo].[Pagesa] OFF

INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (1, 120120, N'Vrapim')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (1, 125124, N'Peshngritje')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (1, 124123, N'Kercim')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (1, 123111, N'Boksi')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (1, 123133, N'Ecje ne Shkall')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (1, 123311, N'Ngjitja')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (1, 213213, N'Terheqje')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (2, 135148, N'Vrapim')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (2, 252354, N'Peshngritje')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (2, 364544, N'Kercim')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (2, 123124, N'Boksi')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (2, 432145, N'Ecje ne Shkall')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (2, 543213, N'Ngjitja')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (2, 194993, N'Terheqje')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (3, 819188, N'Vrapim')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (3, 919288, N'Peshngritje')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (3, 284718, N'Kercim')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (3, 741258, N'Boksi')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (3, 258741, N'Ecje ne Shkall')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (3, 125478, N'Ngjitja')
INSERT [dbo].[Paisjet] ([FID], [NrSerik], [Pershkrimi]) VALUES (3, 234658, N'Terheqje')
SET IDENTITY_INSERT [dbo].[Paisjet] OFF

INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 1, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 2, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 3, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 4, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 5, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 6, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 7, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 8, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 9, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (1, 10, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 1, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 2, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 3, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 4, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 5, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 6, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 7, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 8, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 9, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (2, 10, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 1, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 2, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 3, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 4, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 5, 'F')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 6, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 7, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 8, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 9, 'M')
INSERT [dbo].[Zhveshtore] ([FID], [Numri], [Gjinia]) VALUES (3, 10, 'M')
SET IDENTITY_INSERT [dbo].[Zhveshtore] OFF

ALTER TABLE [dbo].[Klienti]  WITH CHECK ADD  CONSTRAINT [FK_Klienti_Fitnesi] FOREIGN KEY([FID])
REFERENCES [dbo].[Fitnesi] ([FID])
GO
ALTER TABLE [dbo].[Klienti] CHECK CONSTRAINT [FK_Klienti_Fitnesi]
GO

ALTER TABLE [dbo].[Klienti]  WITH CHECK ADD  CONSTRAINT [FK_Klienti_Trajneri] FOREIGN KEY([TID])
REFERENCES [dbo].[Trajneri] ([TID])
GO
ALTER TABLE [dbo].[Klienti] CHECK CONSTRAINT [FK_Klienti_Trajneri]
GO

ALTER TABLE [dbo].[Menagjeri]  WITH CHECK ADD  CONSTRAINT [FK_Menagjeri_Stafi] FOREIGN KEY([SID])
REFERENCES [dbo].[Stafi] ([SID])
GO
ALTER TABLE [dbo].[Menagjeri] CHECK CONSTRAINT [FK_Menagjeri_Stafi]
GO

ALTER TABLE [dbo].[Pagesa]  WITH CHECK ADD  CONSTRAINT [FK_Pagesa_Klienti] FOREIGN KEY([KID])
REFERENCES [dbo].[Klienti] ([KID])
GO
ALTER TABLE [dbo].[Pagesa] CHECK CONSTRAINT [FK_Pagesa_Klienti]
GO

ALTER TABLE [dbo].[Paisjet]  WITH CHECK ADD  CONSTRAINT [FK_Paisjet_Fitnesi] FOREIGN KEY([FID])
REFERENCES [dbo].[Fitnesi] ([FID])
GO
ALTER TABLE [dbo].[Paisjet] CHECK CONSTRAINT [FK_Paisjet_Fitnesi]
GO

ALTER TABLE [dbo].[Puntori]  WITH CHECK ADD  CONSTRAINT [FK_Puntori_Stafi] FOREIGN KEY([SID])
REFERENCES [dbo].[Stafi] ([SID])
GO
ALTER TABLE [dbo].[Puntori] CHECK CONSTRAINT [FK_Puntori_Stafi]
GO

ALTER TABLE [dbo].[Stafi]  WITH CHECK ADD  CONSTRAINT [FK_Stafi_Fitnesi] FOREIGN KEY([FID])
REFERENCES [dbo].[Fitnesi] ([FID])
GO
ALTER TABLE [dbo].[Stafi] CHECK CONSTRAINT [FK_Stafi_Fitnesi]
GO

ALTER TABLE [dbo].[Trajneri]  WITH CHECK ADD  CONSTRAINT [FK_Trajneri_Stafi] FOREIGN KEY([SID])
REFERENCES [dbo].[Stafi] ([SID])
GO
ALTER TABLE [dbo].[Trajneri] CHECK CONSTRAINT [FK_Trajneri_Stafi]
GO

ALTER TABLE [dbo].[Zhveshtore]  WITH CHECK ADD  CONSTRAINT [FK_Zhveshtore_Fitnesi] FOREIGN KEY([FID])
REFERENCES [dbo].[Fitnesi] ([FID])
GO
ALTER TABLE [dbo].[Zhveshtore] CHECK CONSTRAINT [FK_Zhveshtore_Fitnesi]
GO

USE [master]
GO
ALTER DATABASE [GymManagementSystem] SET  READ_WRITE 
GO

/*Shtojme pjesen e kodit per Login */
USE GymManagementSystem

CREATE TABLE [dbo].[Perdoruesi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NULL,
	[Password] [varchar](550) NULL,
	[RoliID] [int] NULL,
 CONSTRAINT [PK_Perdoruesi] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[Roli](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Emertimi] [varchar](50) NULL,
 CONSTRAINT [PK_Roli] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'qendrim.rexhepi', N'123456', 1)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'flakron.zymberi', N'112233', 1)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'egzon.thaqi', N'113355', 1)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'egzon.zymberi', N'224466', 1)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'endrit.maliqi', N'em1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'leonita.halimi', N'lh1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'lindita.hamiti', N'lh4321', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'ardit.ramadani', N'ar1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'menderim.fazliu', N'mf1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'valentina.bunjaku', N'vb1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'enver.zymberi', N'ez1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'qendresa.krasniqi', N'qk1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'laura.morina', N'lm1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'dardan.nebihi', N'dn1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'gent.rashiti', N'gr1234', 2)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'miranda.rahimi', N'mr1234', 2)


INSERT [dbo].[Roli] ([Emertimi]) VALUES (N'Admini')
INSERT [dbo].[Roli] ([Emertimi]) VALUES (N'Useri')

ALTER TABLE [dbo].[Perdoruesi]  WITH CHECK ADD  CONSTRAINT [FK_Perdoruesi_Roli] FOREIGN KEY([RoliID])
REFERENCES [dbo].[Roli] ([ID])
GO
ALTER TABLE [dbo].[Perdoruesi] CHECK CONSTRAINT [FK_Perdoruesi_Roli]
GO