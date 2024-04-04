package com.sportsmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "Ranks")
public class Ranks {

//	not working
//    @Id
//    @OneToOne
//    @JoinColumn(name = "id")
//    private Player player;
//
//    @Column(unique = true)
//    private int t20_rank;
//
//    @Column(unique = true)
//    private int odi_rank;
//
//    @Column(unique = true)
//    private int test_rank;
//

	
	
	
	
	// working
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "player_id")
	private int id;
	
	  @Column(unique = true)
	  private int t20_rank;
	  @Column(unique = true)
	  private int odi_rank;
	  @Column(unique = true)
	  private int test_rank;

	  // try below if above not working
//	  	@OneToOne(cascade = CascadeType.ALL, optional = false)

	  	
	  	@JsonIgnore
	  	@OneToOne
	  	@MapsId 
	    @JoinColumn(name = "player_id")
	    private Player player;
	
	
	  	public Ranks(Player player, int t20_rank, int odi_rank, int test_rank) {
	  		super();
	  		this.player = player;
	  		this.t20_rank = t20_rank;
	  		this.odi_rank = odi_rank;
	  		this.test_rank = test_rank;
	  	}
	  	
		public Ranks() {
			super();
		}
    
    
}


// working
//
//    @Id
//    private int id;
//    @OneToOne
//    @JoinColumn(name = "id")
//    private Player player;
//    @Column(unique = true)
//    private int t20_rank;
//    @Column(unique = true)
//    private int odi_rank;
//    @Column(unique = true)
//    private int test_rank;
//
//
// public Ranks() {
// }
//
// public Ranks(int id, Player player, int t20_rank, int odi_rank, int test_rank) {
//     this.id = id;
//     this.player = player;
//     this.t20_rank = t20_rank;
//     this.odi_rank = odi_rank;
//     this.test_rank = test_rank;
// }
//
// public int getId() {
//     return id;
// }
//
// public void setId(int id) {
//     this.id = id;
// }
//
// public Player getPlayer() {
//     return player;
// }
//
// public void setPlayer(Player player) {
//     this.player = player;
// }
//
// public int getT20_rank() {
//     return t20_rank;
// }
//
// public void setT20_rank(int t20_rank) {
//     this.t20_rank = t20_rank;
// }
//
// public int getOdi_rank() {
//     return odi_rank;
// }
//
// public void setOdi_rank(int odi_rank) {
//     this.odi_rank = odi_rank;
// }
//
// public int getTest_rank() {
//     return test_rank;
// }
//
// public void setTest_rank(int test_rank) {
//     this.test_rank = test_rank;
// }