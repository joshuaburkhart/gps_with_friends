﻿#pragma checksum "C:\Users\bunny_000\Documents\SS\0G000 Group\UO\gps_with_friends\WP8Client\GPSWithFriends\GPSWithFriends\MainPage.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "CA95B32002925DD5FA107E8391F82314"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.18046
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using Microsoft.Phone.Controls;
using Microsoft.Phone.Maps.Controls;
using System;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Automation.Peers;
using System.Windows.Automation.Provider;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Interop;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Imaging;
using System.Windows.Resources;
using System.Windows.Shapes;
using System.Windows.Threading;


namespace GPSWithFriends {
    
    
    public partial class MainPage : Microsoft.Phone.Controls.PhoneApplicationPage {
        
        internal System.Windows.Controls.Grid LayoutRoot;
        
        internal Microsoft.Phone.Maps.Controls.Map MyMap;
        
        internal System.Windows.Controls.TextBlock GPSLocationTextblock;
        
        internal System.Windows.Controls.ListBox FriendsListBox;
        
        internal System.Windows.Controls.Button InviteButton;
        
        internal System.Windows.Controls.ListBox RequestsListBox;
        
        internal System.Windows.Controls.ListBox FriendsManageListBox;
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Windows.Application.LoadComponent(this, new System.Uri("/GPSWithFriends;component/MainPage.xaml", System.UriKind.Relative));
            this.LayoutRoot = ((System.Windows.Controls.Grid)(this.FindName("LayoutRoot")));
            this.MyMap = ((Microsoft.Phone.Maps.Controls.Map)(this.FindName("MyMap")));
            this.GPSLocationTextblock = ((System.Windows.Controls.TextBlock)(this.FindName("GPSLocationTextblock")));
            this.FriendsListBox = ((System.Windows.Controls.ListBox)(this.FindName("FriendsListBox")));
            this.InviteButton = ((System.Windows.Controls.Button)(this.FindName("InviteButton")));
            this.RequestsListBox = ((System.Windows.Controls.ListBox)(this.FindName("RequestsListBox")));
            this.FriendsManageListBox = ((System.Windows.Controls.ListBox)(this.FindName("FriendsManageListBox")));
        }
    }
}

